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
    public static boolean traverse(char[][] board,int sr,int er ,int sc,int ec){
        Set<Character> set = new HashSet<>();
        for(int row = sr;row<=er;row++){
            for(int col = sc;col<=ec;col++){
                if(board[row][col] == '.')
                    continue;
                else if(set.contains(board[row][col]))
                    return false;
                else{
                    set.add(board[row][col]);
                }
            }
        }
        return true;
    }
    public static boolean isValidSudokuBrute(char[][] board) {

        for(int row=0;row<9;row++){
            Set<Character> set = new HashSet<>();
            for(int col=0;col<9;col++){
                if(board[row][col] == '.')
                    continue;
                else if(set.contains(board[row][col]))
                    return false;
                else{
                    set.add(board[row][col]);
                }
            }
        }
        for(int col=0;col<9;col++){
            Set<Character> set = new HashSet<>();
            for(int row=0;row<9;row++){
                if(board[row][col] == '.')
                    continue;
                else if(set.contains(board[row][col]))
                    return false;
                else{
                    set.add(board[row][col]);
                }
            }
        }

        boolean flag = false;
        for(int sr=0;sr<9; sr+=3){
            int er = sr+2;

            for(int sc =0;sc<9;sc+=3){
                int ec = sc+2;

                flag =traverse(board,sr,er,sc,ec);
                if(!flag){
                    return false;
                }
            }

        }
        return flag;

    }


    // 🧪 Test Main Method
    public static void main(String[] args) {


        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
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
