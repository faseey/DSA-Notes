package Stacks.Questions;

import java.util.Arrays;
import java.util.Stack;

public class NextgreaterElement_II {
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for(int i =2*n-1;i>=0;i--){  //testcase [5,4,3,2,1]  [-1,5,5,5,5]
            while(!st.empty() && st.peek() <= nums[i%n]){
                st.pop();
            }
            if(st.empty()){
                ans[i%n] = -1;
            }
            else{
                ans[i%n] = st.peek();
            }
            st.push(nums[i%n]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElements(new int[] {4,2,1})));
    }
}