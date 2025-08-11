package BinarySearch.BinarSearch;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    static int recbinarysearch(int s,int e , int[] arr , int target){
        if(s>e) return -1;

        int mid = s +(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target ){
            return recbinarysearch(mid+1,e,arr,target);

        }
        else{
            return recbinarysearch(s,mid-1,arr,target);
        }


    }
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int e = arr.length-1;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        System.out.println(recbinarysearch(0,e,arr,target));
    }

    // return the index
    // return -1 if it does not exist
}
