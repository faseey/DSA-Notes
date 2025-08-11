package Recursion.PracticeQs;

import java.util.ArrayList;
import java.util.List;

public class letterCombination {
    public static void main(String[] args) {
        System.out.println(pad("","12"));
    }

    static String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };
    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
        return list;
        }
        int digit = up.charAt(0) - '0';
        
    ArrayList <String> list = new ArrayList<>();
        for(int i =(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a' + i);
            list.addAll(pad(p+ch,up.substring(1)));

        }
        return list;
    }
}
