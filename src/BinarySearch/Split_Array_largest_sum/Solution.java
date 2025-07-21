package BinarySearch.Split_Array_largest_sum;
//https://leetcode.com/problems/split-array-largest-sum/
class Solution {
    public static int splitArray(int[] nums, int k) {

        int start =0;
        int end =0;

        for(int i =0;i<nums.length;i++){
            start = Math.max(start , nums[i]);
            end += nums[i];
        }

        while(start <end){
            int mid = start + (end-start) /2;

            int sum=0;
            int count=1;

            for(int num :nums){
                if(sum + num <= mid){
                    sum+=num;
                }
                else{
                    count++;
                    sum=num;
                }
            }
            if(count<=k){
                end = mid;
            }
            else{
                start = mid+1;
            }

        }
        return start;

    }

    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,4));
    }
}