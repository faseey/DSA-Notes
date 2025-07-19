package BinarySearch.Find_smlalest_letter_greater_than_target;
class Solution {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start =0;
        int end = letters.length -1;


        while(start <= end){
            int mid = start + (end -start) /2;

            if(letters[mid] <= target ){
                start = mid+1;
            }
            else if(letters[mid] >= target){
                end = mid-1;
            }
        }

        return letters[start%n];

    }

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr,'c'));
    }
}