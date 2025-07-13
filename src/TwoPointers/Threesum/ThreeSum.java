package TwoPointers.Threesum;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> brutethreeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet); // to handle duplicate triplets
                        result.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }//O(n^3)
    public static List<List<Integer>> optimizethreeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0,j=0,k;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            j = i+1;
            k= nums.length-1;
            int target = nums[i] * -1;

            while(j<k){
                int sum = nums[k] + nums[j];
                if(sum == target){

                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;

                    j++;
                    k--;
                }
                else if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return result;
    }//O(N^2)
    //n log n sorting ans n^2 for two pointers

    public static void main(String[] args) {
        int[] arr = {2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};
        System.out.println(optimizethreeSum(arr));
        System.out.println(brutethreeSum(arr));

    }
}
