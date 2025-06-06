package org.example.geeksamazon;

import java.util.Stack;
//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
public class ParenthesisChecker {

    static boolean isBalanced(String x)
    {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            if(stack.isEmpty()){
                stack.push(x.charAt(i));
            }
            else if(eq(stack.peek(),x.charAt(i))){
                stack.pop();
            }
            else{
                stack.push(x.charAt(i));
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    static boolean eq(char a, char b){
        if(a=='(' && b==')') return true;
        if(a=='{' && b=='}') return true;
        if(a=='[' && b==']') return true;
        return false;
    }
}
