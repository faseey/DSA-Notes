package Arrays.ValidSudoko;

import java.util.*;

public class validsudoko {

    // ✅ Optimal Version - O(1) space per cell (total O(81))
    public static boolean isValidSudokuOptimal(char[][] board) {
        Set<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char num = board[i][j];
                if(num == '.') continue;

                String row = num + "row" + i;
                String col = num + "col" + j;
                String box = num + "box" + (i/3) + "_" + (j/3);

                if(set.contains(row) || set.contains(col) || set.contains(box)) {
                    return false;
                }

                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
    }

    //  Brute Force Version – Time: O(9^3) = O(729)  O(N^3)
    public static boolean isValidSudokuBrute(char[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char num = board[i][j];
                if(num == '.') continue;

                // check row
                for(int k = 0; k < 9; k++) {
                    if(k != j && board[i][k] == num) return false;
                }

                // check column
                for(int k = 0; k < 9; k++) {
                    if(k != i && board[k][j] == num) return false;
                }

                // check 3x3 box
                int boxRow = (i / 3) * 3;
                int boxCol = (j / 3) * 3;
                for(int r = boxRow; r < boxRow + 3; r++) {
                    for(int c = boxCol; c < boxCol + 3; c++) {
                        if(r != i && c != j && board[r][c] == num) return false;
                    }
                }
            }
        }
        return true;
    }

    // 🧪 Test Main Method
    public static void main(String[] args) {


        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Brute Force Valid: " + isValidSudokuBrute(board)); // Output: true
        System.out.println("Optimal Valid:     " + isValidSudokuOptimal(board)); // Output: true
    }
}
