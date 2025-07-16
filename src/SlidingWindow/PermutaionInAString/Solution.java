package SlidingWindow.PermutaionInAString;
import java.util.Arrays;
class Solution {
    public static boolean brutecheckInclusion(String s1, String s2) {
        int n = s1.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i =0;i<n;i++){
            arr1[s1.charAt(i) - 'a']++;
        }

        int i =0 ,j =0;

        while(j<s2.length()){
            arr2[s2.charAt(j) - 'a']++;

            if(j-i+1 <n){
                j++;
                continue;
            }
            if(Arrays.equals(arr1,arr2)) return true;
            arr2[s2.charAt(i) - 'a']--;
            i++;
            j++;


        }
        return false;


    }
    public static boolean optimizedcheckInclusion(String s1, String s2) {
        int n = s1.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i =0;i<n;i++){
            arr1[s1.charAt(i) - 'a']++;
        }

        int i =0 ,j =0;

        while(j<s2.length()){
            arr2[s2.charAt(j) - 'a']++;

            if(j-i+1 <n){
                j++;
                continue;
            }
            if(Arrays.equals(arr1,arr2)) return true;
            arr2[s2.charAt(i) - 'a']--;
            i++;
            j++;


        }
        return false;


    }

    public static void main(String[] args) {
        String s = "ab";
        String t = "eidbaooo";
        System.out.println(brutecheckInclusion(s,t));
        System.out.println(optimizedcheckInclusion(s,t));

    }
}