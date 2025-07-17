package SlidingWindow.MinimumWindowSubstring;

import java.util.HashMap;

class Solution {
    public static String bruteminWindow(String s, String t) {
        StringBuilder str = new StringBuilder();
        int n = t.length();
        int length =0;
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
                    if(temp.get(s.charAt(j)) > 0){
                        count++;
                    }

                }
                temp.put(s.charAt(j),temp.getOrDefault(s.charAt(j),0)-1);
                if(count ==n){
                    if(minlength > j-i+1){
                        minlength = Math.min(minlength,j-i+1);
                        str = new StringBuilder(s.substring(i, j + 1));


                    }
                    break;
                }

            }
        }
        return new String (str); //TC O(N^2)  TL HITTT!!! at last case :(

    }
    public static String optimalminWindow(String s, String t) {


        int[] map = new int[128]; //or Ascii
        int minlen = Integer.MAX_VALUE;
        int l=0,r=0;
        int count =t.length();
        int start=-1;

        for(int i=0;i<t.length();i++){
            map[t.charAt(i)] ++;
        }


        while(r<s.length()){
            if( map[s.charAt(r)] >0){
                count--;

            }
            map[s.charAt(r)]--;
            r++;

            while(count == 0){
                if (r - l < minlen) {
                    minlen = r - l;
                    start = l;
                }


                map[s.charAt(l)]++;
                if(map[s.charAt(l)] > 0) count++;
                l++;

            }
        }


        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);

    }//TC O(N)



    public static void main(String[] args) {
        String s = "babb";
        String t =  "baba";
        System.out.println(bruteminWindow(s,t));
        System.out.println(optimalminWindow(s,t));
    }
}