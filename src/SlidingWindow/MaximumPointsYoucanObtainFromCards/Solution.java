package SlidingWindow.MaximumPointsYoucanObtainFromCards;

class Solution {
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int maxsum=0;
        int sum =0;
        int j=0;
        while(j<k){
            sum += cardPoints[j];
            j++;
        }
        maxsum = sum;
        j=0;
        for(int i =k-1;i>=0;i--,j++){
            sum -= cardPoints[i];
            sum += cardPoints[n-1-j];

            maxsum = Math.max(maxsum,sum);




        }

        return maxsum;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        System.out.println(maxScore(arr,4));
    }
}