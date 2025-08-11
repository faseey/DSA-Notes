package Stacks.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElemeent_I{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st  = new Stack<>();
        int[] res = new int[nums1.length];

        for(int i= nums2.length-1;i>=0;i--){
            if(st.empty()){
                map.put(nums2[i] , -1);
                st.push(nums2[i]);
            }
            else {
                while(!st.empty() && st.peek() <= nums2[i]){
                    st.pop();
                }
                if(st.empty()){
                    map.put(nums2[i] , -1);
                }
                else{
                    map.put(nums2[i],st.peek());
                }
                st.push(nums2[i]);
            }
        }
        for(int i =0;i<res.length;i++){
            res[i] = map.get(nums1[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr ={4,1,2};
        int[] arr2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(arr,arr2)));
    }
}
