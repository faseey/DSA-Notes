package Backtracking;
//https://leetcode.com/problems/sudoku-solver/
public class Sudokosolver {
    public void solveSudoku(char[][] board) {
        solve(board);

    }
    static boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] =='.'){
                    for(char ch = '1';ch<='9';ch++){
                        if(isSafe(board,i,j,ch)){
                            board[i][j] = ch;
                            if(solve(board) == true){
                                return true;
                            }
                            else{
                                board[i][j] ='.';
                            }
                        }


                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isSafe(char[][] board,int row,int col,char ch){

        for(int i =0;i<9;i++){
            if(board[i][col] == ch){
                return false;
            }
            if(board[row][i] == ch){
                return false;
            }
            int r = (3 *(row/3)) + i/3;
            int c = (3 *(col/3)) + i%3;
            if(board[r][c] == ch){
                return false;
            }
        }
        return true;

    }
}
