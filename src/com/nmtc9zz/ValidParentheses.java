package com.nmtc9zz;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("([}}])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(')');
            } else if(s.charAt(i) == '{'){
                st.push('}');
            } else if(s.charAt(i) == '['){
                st.push(']');
            }else if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else if(st.empty()){
                return false;
            }else if(!st.isEmpty() && st.peek() != s.charAt(i)){
                return false;
            }
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}
