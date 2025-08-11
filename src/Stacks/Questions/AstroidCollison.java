package Stacks.Questions;

import java.util.Arrays;
import java.util.Stack;

class AstroidCollison {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int a : asteroids){
            while(!st.empty() && a < 0 && st.peek() >0){
                int sum = a + st.peek();

                if(sum <=0){
                    if(sum==0) a =0;
                    st.pop();
                }
                else{
                    a =0;
                    break;
                }

            }

            if(a!=0 ){
                st.push(a);}
        }
        int size = st.size();
        int[] res = new int[size];

        for(int i = size-1;i>=0;i--){
            res[i] = st.peek();
            st.pop();
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[] {10,5,-2,-11})));
    }
}