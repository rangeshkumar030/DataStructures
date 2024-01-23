package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        String digits="23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {

        List<String> list=new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        char[][] arr={
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'j','k','l'},
                {'m','n','o'},
                {'p','q','r','s'},
                {'t','u','v'},
                {'w','x','y','z'}
        };
        getLetterCombinations(digits,list,arr,0,0,new char[digits.length()]);
        return list;
    }

    public static void getLetterCombinations(String digits,List<String> list,char[][] arr,int i,int index, char[] chars) {
        if(i==digits.length()){
            list.add(String.valueOf(chars));
            return;
        }
        int digit=Integer.parseInt(String.valueOf(digits.charAt(i)))-2;
        for (int j = 0; j < arr[digit].length; j++) {
            chars[index]=arr[digit][j];
            getLetterCombinations(digits,list,arr,i+1,index+1,chars);
        }

    }

}



