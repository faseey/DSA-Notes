package Arrays.ContiguousArray;

import java.util.HashMap;

public class Solution {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int length =0;
        int cumsum=0;
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i] ==0){
                cumsum += -1;

            }
            else{
                cumsum +=1;
            }
            if(map.containsKey(cumsum)){
                length = Math.max(length,(i - map.get(cumsum)));
            }
            else{
                map.put(cumsum,i);
            }
        }

        return length;

    }

    public static void main(String[] args) {

            int[] arr = {1,1,0,0,1,0,0,0,1,1,1};
            System.out.println(findMaxLength(arr));


    }
}
