package TwoPointers.TrappingRainwatter;

import java.util.Arrays;

class Solution {
    public static int brutetrap(int[] height) {


        int l=0;
        int r = height.length-1;
        int leftmax =height[l];
        int rightmax =height[r];
        int water = 0;

        int[] leftheight = new int[height.length];
        int[] rightheight = new int[height.length];

        for(int i=0;i<height.length;i++){
            if(height[i]>leftmax){
                leftmax = height[i];
                leftheight[i] = leftmax;
            }
            else{
                leftheight[i] = leftmax;
            }


        }for(int i=height.length-1;i>=0;i--){
            if(height[i]>rightmax){
                rightmax = height[i];
                rightheight[i] = rightmax;
            }
            else{
                rightheight[i] = rightmax;
            }


        }
        int i=0;
        while(l<r){
            int ans = Math.min(leftheight[l],rightheight[r]) - height[i];
            if(ans>0){

                water +=ans;
            }
            if(height[l] <height[r]){
                l++;
                i =l;
            } else if (height[l]>height[r]) {
                r--;
                i=r;

            }
            else{
                l++;
                i=l;
            }
        }


        return water;

    }
    public static int optimizetrap(int[] height) {


        int l=0;
        int r = height.length-1;
        int leftmax =height[l];
        int rightmax =height[r];
        int water = 0;


        int i=0;
        while(l<r){
            int ans = Math.min(leftmax,rightmax) - height[i];

            if(ans>0){

                water +=ans;
            }
            if(height[l] <height[r]){
                l++;
                leftmax = Math.max(height[l],leftmax );
                i =l;
            } else if (height[l]>height[r]) {
                r--;
                rightmax = Math.max(rightmax,height[r]);
                i=r;

            }
            else{
                l++;
                leftmax = Math.max(height[l],leftmax );
                i=l;
            }
        }


        return water;

    }


    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(brutetrap(height));
        System.out.println(optimizetrap(height));
    }
}