package Strings.Palindrome;

    class Solution {
        public static boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int i=0,j=s.length()-1;
            while(i<j){

                if(s.charAt(i) != s.charAt(j)) {


                    if (s.charAt(i)< '0' ||s.charAt(i) > '9' && s.charAt(i) < 'a' || s.charAt(i) > 'z') {
                        i++;

                    }else if (s.charAt(j)< '0' ||s.charAt(j) > '9' && s.charAt(j) < 'a' || s.charAt(j) > 'z') {
                        j--;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    i++;
                    j--;}
            }
            return true;

        }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
