package Recursion.PracticeQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
//        subset("","abc");
//        System.out.println(subsetref("","abc"));

        List<List<Integer>> ans = dupsubset(new int[]{1,2,2});

        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p+ch , up.substring(1));
        subset(p , up.substring(1));
    }


    static ArrayList<String> subsetref(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetref(p+ch , up.substring(1));
        ArrayList<String> right = subsetref(p , up.substring(1));
        left.addAll(right);
        return left;
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int nums : arr){
            int n = outer.size();
            for(int i =0;i<n;i++){
                List<Integer> inner= new ArrayList<>(outer.get(i));
                inner.add(nums);
                outer.add(inner);

            }
        }
        return outer;

    }    static List<List<Integer>> dupsubset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0;
        int e =0;
        for(int j =0 ;j<arr.length; j++){
            s =0;
            if(j>0 && arr[j] == arr[j-1] ){
                s = e+1;
            }
            e = outer.size()-1;
            int n = outer.size();
            for(int i =s;i<n;i++){
                List<Integer> inner= new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);

            }
        }
        return outer;

    }
}
