package BinarySearch.Peak_index_in_Mountain_Arr;

import java.util.Arrays;

class Solution {
    public static int peakIndexInMountainArray(int[] arr) {

        int n = arr.length;
        int start =0;
        int end = arr.length-1;

        while(start<end){

            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }

        }

        return start;

    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}