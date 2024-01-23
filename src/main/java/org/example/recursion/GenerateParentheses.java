package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n=3;
        List<String> list=generateParenthesis(n);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        char[] chars=new char[2*n];
        generateParenthesis(n,0,0,0,chars,list);
        return list;
    }

    private static void generateParenthesis(int n, int l, int r, int i, char[] chars, List<String> list) {
        if(i==2*n){
            list.add(String.valueOf(chars));

            return;
        }
        if(l==r){
            chars[i]='(';
            generateParenthesis(n,l+1,r,i+1,chars,list);
        }
        else if(l>r){
            if(l==n){
                chars[i]=')';
                generateParenthesis(n,l,r+1,i+1,chars,list);
            }
            else{
                chars[i]='(';
                generateParenthesis(n,l+1,r,i+1,chars,list);
                chars[i]=')';
                generateParenthesis(n,l,r+1,i+1,chars,list);
            }
        }

    }

}
