package SlidingWindow.Maximumavgsubarray;

import java.io.FilterOutputStream;

class Solution {
    public  static double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=0;
        double avg =0;
        int  ans =0;
        double maxavg =Integer.MIN_VALUE;



        while(r < nums.length) {
            ans += nums[r];

            if(r -l +1 == k)
            {
                avg = (ans + 0.0)/k;
                maxavg = Math.max(avg , maxavg);
                ans -= nums[l];
                l++;
            }

            r++;


        }
        return maxavg;

    }

    public static void main(String[] args) {
        int[] arr = {-1};
        System.out.println(findMaxAverage(arr,1));
    }
}