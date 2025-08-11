package Stacks.Questions;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c =='{' || c== '['){
                st.push(c);
            }
            else{
                if(st.empty()) return false;
                if(c == ')'){
                    if(st.peek() =='('){
                        st.pop();
                    }
                    else return false;

                }
                else if(c == '}'){
                    if(st.peek() =='{'){
                        st.pop();
                    }
                    else return false;

                }
                else if(c == ']'){
                    if(st.peek() =='['){
                        st.pop();
                    }
                    else return false;

                }
                else{
                    return false;
                }
            }
        }
        return st.empty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("(){"));
    }
}

