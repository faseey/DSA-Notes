package Stacks.Questions;

import java.util.Stack;

public class MinStack {

    Stack<Long> st = new Stack<>();
    long min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int val) {
        if(st.empty()){
            st.push((long)(val));
            min = val;

        }
        else{
            if(val<min){
                st.push(val *2L - min);
                min = val;
            }

            else{
                st.push((long)(val));
            }
        }

    }

    public void pop() {
        if(st.empty()){
            return;
        }
        else{
            if(st.peek()> min){
                st.pop();
            }
            else{
                min  = min*2L - st.peek();
                st.pop();
            }
        }

    }

    public int top() {
        if(st.empty()){
            return -1;
        }
        else{
            if(st.peek() < min) return(int) (min);
            return (int)(long)(st.peek());
        }


    }

    public int getMin() {
        return (int)(min);
    }


}

