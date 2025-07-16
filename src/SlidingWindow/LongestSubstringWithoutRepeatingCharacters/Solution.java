package SlidingWindow.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {

    // taking all substring and breaking the loop when a duplicate arrives
    public static int brutelengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (set.contains(c)) break;
                set.add(c);
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;
    }
    public static int optimizedlengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int length = 0;
        int maxlength = 0;
        int l =0;
        int r = 0;
        while(r<s.length()){
            //means char already
            if(map.containsKey(s.charAt(r))){
                //now to check weather its int the window or not if not then not valid
                if(map.get(s.charAt(r)) >= l){
                    l = map.get(s.charAt(r))+1;

                }

            }

            map.put(s.charAt(r) ,r);
            length = r-l+1;


            maxlength = Math.max(maxlength,length);
            r++;
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(brutelengthOfLongestSubstring(s));
        System.out.println(optimizedlengthOfLongestSubstring(s));

    }
}