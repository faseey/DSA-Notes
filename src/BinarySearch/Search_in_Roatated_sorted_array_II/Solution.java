package BinarySearch.Search_in_Roatated_sorted_array_II;

class Solution {
    public static  boolean search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int pivot =-1;


        //finidng pivot
        while(start<end){
            while(start < end && nums[start] == nums[start+1]){ start++;}
            while(start < end && nums[end] == nums[end-1]){ end--;}
            int mid = start + (end-start)/2;

            if(nums[mid] >nums[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }

        }
        pivot = end;
        //if there is not rotation
        if(pivot ==0) return binarysearch(nums,target,0,nums.length-1);

        if(binarysearch(nums,target,0,pivot-1)) return true; //if found
        return binarysearch(nums,target,pivot,nums.length-1); //if not found


    }
    //simple binary search
    static boolean binarysearch(int[] nums, int target,int start,int end){
        while(start <= end){
            int mid = start + (end-start)/2;


            if(nums[mid] < target){
                start = mid+1;
            }
            else if(nums[mid] > target ){
                end = mid-1;
            }
            else{
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(search(arr,2));
    }
}