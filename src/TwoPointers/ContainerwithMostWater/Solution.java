package TwoPointers.ContainerwithMostWater;

class Solution {
    public static int brutemaxArea(int[] height) {
        int maxvol = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                int width = j - i;
                int area = width * minHeight;
                if (area > maxvol) {
                    maxvol = area;
                }
            }
        }

        return maxvol;
    }//O(N^2)


    public static int maxArea(int[] height) {
        int volume = 0;
        int maxvol = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {

            int num = Math.min(height[i], height[j]); //1
            volume = (j - i) * num;
            if (maxvol < volume) {
                maxvol = volume;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }


        }
        return maxvol;

    }//O(N)

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
        System.out.println(brutemaxArea(height));
    }
}