package SlidingWindow.MinimumWindowSubstring;

import java.util.HashMap;

class Solution {
    public static String minWindow(String s, String t) {
        StringBuilder str = new StringBuilder();
        int n = t.length();
        int minlength =Integer.MAX_VALUE ;
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();


        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> temp = new HashMap<>(map);

        for(int i =0;i<s.length();i++){
            count =0;
            temp = new HashMap<>(map);
            for(int j=i;j<s.length();j++){
                if(temp.containsKey(s.charAt(j))){
                    System.out.println("dound"  + s.charAt(j));
                    if(temp.get(s.charAt(j)) > 0){
                        System.out.println(temp.get(s.charAt(j)));
                        count++;
                    }

                }
                temp.put(s.charAt(j),temp.getOrDefault(s.charAt(j),0)-1);
                if(count ==n){
                    System.out.println("fpound one at " + i + " " + j);
                    if(minlength > j-i+1){
                        minlength = Math.min(minlength,j-i+1);
                        str = new StringBuilder(s.substring(i, j + 1));


                    }
                    break;
                }

            }
        }
        return new String (str);

    }

    public static void main(String[] args) {
        String s = "babb";
        String t =  "baba";
        System.out.println(minWindow(s,t));
    }
}