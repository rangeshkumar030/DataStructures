package org.example.recursion;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

//https://leetcode.com/problems/letter-case-permutation/description/
public class LetterCasePremutation {

    public List<String> letterCasePermutation(String s) {
        List<String> res=new ArrayList<>();
        s.toLowerCase();
        char[] str=new char[s.length()];
        letterCasePermutation(res,s,str,0);
        return res;
    }

    private void letterCasePermutation(List<String> res, String s, char[] str, int i) {
        if(i==s.length()){
            res.add(Stream.of(str).map(a->String.valueOf(a)).reduce("", (a, b) -> a+b));
        }
            str[i]=s.charAt(i);
            letterCasePermutation(res,s,str,i+1);
         if (Character.isLetter(s.charAt(i))) {
            str[i]= (char) (s.charAt(i)-32);
            letterCasePermutation(res,s,str,i+1);
        }
    }

}
