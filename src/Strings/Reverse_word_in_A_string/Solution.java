package Strings.Reverse_word_in_A_string;

class Solution {
    public static String reverseWords(String s) {
        s = s.trim().replaceAll(" +", " ");
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        int j =0;
        for(int i =0;i<s.length();i++){
            if(str.charAt(i) == ' '){
                reverseword(str,j,i);
                j =i+1;
            }


        }
        reverseword(str, j, str.length());
        return str.toString();

    }
    public static void reverseword(StringBuilder str , int start ,int end){
        end--;
        while(start <end){
            char temp = str.charAt(start);
            str.setCharAt(start , str.charAt(end));
            str.setCharAt(end , temp );
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
    String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}