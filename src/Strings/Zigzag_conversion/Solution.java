package Strings.Zigzag_conversion;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String zigzag(String s, int numRows) {
        if(numRows ==1) return s;
        List<List<Character>> list = new ArrayList<>();

        for(int i =0;i<numRows;i++){
            list.add(new ArrayList<>());
        }
        int i=0;
        while(i<s.length()){
            for(int down =0;down <numRows && i<s.length() ;down++){ // going zigzag V down ...up
                list.get(down).add(s.charAt(i));
                i++;
            }
            for(int up = numRows-2;up>0 && i<s.length();up--){ //since down has already inserted the chractre numROws-1
                list.get(up).add(s.charAt(i));
                i++;
            }
        }
        String ans = "";
        for( i =0;i<numRows;i++){
            for(int j=0;j<list.get(i).size();j++){
                ans += list.get(i).get(j);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(zigzag(s , 4));
    }
}