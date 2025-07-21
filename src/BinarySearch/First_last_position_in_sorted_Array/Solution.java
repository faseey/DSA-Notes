package BinarySearch.First_last_position_in_sorted_Array;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int start = binarysearch(nums,target,true);
        int end = binarysearch(nums,target,false);

        return new int[]{start,end};
    }
    static int binarysearch(int[] nums, int target , boolean startindex) {
        int start =0;
        int end = nums.length -1 ;
        int ans = -1;

        while(start<=end){
            int  mid = start + (end - start)/2;

            if(nums[mid] < target) {
                start= mid+1;
            }
            else if (nums[mid] > target) {
                end = mid-1;
            }
            else{
                ans = mid;
                if(startindex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }

}