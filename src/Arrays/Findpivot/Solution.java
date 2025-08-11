package Arrays.Findpivot;

class Solution {
    public static int optimalpivotIndex(int[] nums) {

        int total =0;

        for(int i =0;i<nums.length;i++){
            total += nums[i];
        }
        int left=0;
        int right =0;
        for(int i=0;i<nums.length;i++){
            right = total - left -nums[i];

            if(right==left){
                return i;
            }
            left +=nums[i];

        }
        return -1;

    }//O(N) Tc abd sc O(1)
    public static int brutepivotIndex(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 0;
        int idx = -1;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1] + nums[i-1];
        }
        if(left[nums.length-1] ==0) idx=nums.length-1;
        right[nums.length-1] =0;

        for(int i=nums.length-2;i>=0;i--){

            right[i] = right[i+1] + nums[i+1];
            if(left[i] == right[i])
                idx = i;
        }

        return idx;
    }
    //O(N) Tc abd sc O(N)

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(brutepivotIndex(arr));
        System.out.println(optimalpivotIndex(arr));
    }
}
