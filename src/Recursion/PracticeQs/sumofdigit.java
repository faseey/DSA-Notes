package Recursion.PracticeQs;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.swap;

public class sumofdigit {
    public static void main(String[] args) {
       // System.out.println(find(new int[] {4,4,4,4,4},4,0));
        pattern(5);
        int[] arr = {4,3,2,1};
        selection(arr , 0 ,1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static ArrayList find(int[] nums, int target,int s) {
        if (s == nums.length) return new ArrayList<>();

        ArrayList<Integer> list = find(nums, target, s+1);
        if (nums[s] == target) {
            list.add(s);
            return list;
        } else {
            return list;
        }

    }

    static void pattern(int n){
        if(n==0) return;
        pattern(n-1);
        helper(n);

    }
    static void helper(int n){
        if(n==0) {
            System.out.println();
            return;}
        System.out.print('*');
        helper(n-1);
    }

    static void selection(int[]arr , int r , int i,int temp) {
        if (r == arr.length) return;


        if (i < arr.length ) {
            if(arr[temp] > arr[i]){
                 temp = i;


            }
            selection(arr,r,i+1,temp);

        }
        else{
            int a = arr[r];
            arr[r] = arr[temp];
            arr[temp] = a;

            selection(arr,r+1,r+2,r+1);
        }

    }static void bubble(int[]arr , int r , int i) {
        if (r == 0) return;


        if (i < r) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
            bubble(arr,r,i+1);

        }
        else{
            bubble(arr,r-1,0);
        }

    }
}
