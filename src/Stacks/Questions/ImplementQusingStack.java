package Stacks.Questions;

import java.util.Stack;

public class ImplementQusingStack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    int peek = -1;

    public ImplementQusingStack() {

    }

    public void push(int x) {
        if(input.empty()){
            peek = x;
        }
        input.push(x);

    }

    public int pop() {
        if(output.empty()){
            while(!input.empty()){
                output.push(input.peek());
                input.pop();
            }
            peek = -1;
        }
        int ans = output.pop();
        return ans;

    }

    public int peek() {
        if(!output.empty()){
            return output.peek();
        }
        return peek;

    }

    public boolean empty() {
        if(output.empty() && input.empty()){
            return true;
        }
        return false;

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */