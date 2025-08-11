package Arrays.SubarraysumsEqualK;

import java.util.HashMap;

class Solution {

    public static int brutesubarraySum(int[] nums, int k) {
        int count =0;
        for(int s =0;s<nums.length;s++){
            for(int e=s;e<nums.length;e++){
                int total=0;
                for(int l=s;l<=e;l++){
                    total +=nums[l];


                }
                if(k == total) count++;
            }
        }
        return count;

    }//TIME COMPLEXITY   O(N^3)
        public static  int subarraySum(int[] nums, int k) {

            int[] prefix = new int[nums.length];
            prefix[0] = nums[0];
            for(int i =1;i<prefix.length;i++){
                prefix[i] = nums[i] + prefix[i-1];
            }
            int count =0;
            for(int s =0;s<nums.length;s++){

                for(int e=s;e<nums.length;e++){
                    if(e==s &&prefix[s] == k) count++;
                    else if (e!=s){
                        if(k == prefix[e] - prefix[s]) count++;
                    }


                }
            }
            return count;

        }// TIME COMPLEXITY   O(N^2)
    public static  int optimalsubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int result =0;
        int cumsum =0;

        for(int i =0;i<nums.length;i++){
            cumsum+= nums[i];

            int ans = cumsum - k;
            if(map.containsKey(ans)){
                result  +=map.get(ans);
            }
            map.put(cumsum, map.getOrDefault(cumsum, 0) + 1);
        }
        return result;

    }//TIME COMPLEXITY  O(N)




public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,1,2,1};
        System.out.println(subarraySum(arr,4));
        System.out.println(optimalsubarraySum(arr,4));
    }
}