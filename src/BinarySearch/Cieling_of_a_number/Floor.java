package BinarySearch.Cieling_of_a_number;

public class Floor {
    // return the index of greatest  no <= target
    public static int find(int[] nums , int target){
        int s =0;
        int e = nums.length-1;
        int mid =0;
        while(s<=e){
            mid = s + (e-s) /2;

            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] < target){
                s = mid+1;

            }
            else{
                e = mid-1;
            }



        }
        return e;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        System.out.println(find(arr,1));
    }
}
