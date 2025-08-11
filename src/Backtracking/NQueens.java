package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

class Solution {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        // initialize arrays to track and reduce TC
        ArrayList<Integer> leftrow = new ArrayList<>(Collections.nCopies(n, 0));
        ArrayList<Integer> upperDig = new ArrayList<>(Collections.nCopies(2 *n-1, 0));
        ArrayList<Integer> lowerDig = new ArrayList<>(Collections.nCopies(2 *n-1, 0));

        ArrayList<char[]> board = new ArrayList<>(n);

        // initialize with dots
        for (int r = 0; r < n; r++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            board.add(row);
        }


        solve(0,n,ans,board,lowerDig,upperDig,leftrow);
        return ans;

    }
    public static void solve(int col,int n,List<List<String>> ans,ArrayList<char[]> board ,ArrayList<Integer> lowerDig,ArrayList<Integer> upperDig, ArrayList<Integer> leftrow){
        if(col == n){
            List<String> temp = new ArrayList<>();
            for (char[] row : board) {
                temp.add(new String(row)); // convert each row to String
            }
            ans.add(temp);
            return;
        }
        for(int i=0;i<n;i++){
            if(leftrow.get(i) ==0 && lowerDig.get(i+col)==0 && upperDig.get((n-1) + col-i) ==0){
                leftrow.set(i,1);
                lowerDig.set(i+col,1);
                upperDig.set(n-1 + col-i,1);
                board.get(i)[col] = 'Q';
                solve(col+1,n,ans,board,lowerDig,upperDig,leftrow);
                board.get(i)[col] = '.';
                leftrow.set(i,0);
                lowerDig.set(i+col,0);
                upperDig.set(n-1 + col-i,0);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}