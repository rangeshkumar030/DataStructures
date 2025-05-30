package org.example.dynamicprogramming;

public class LongestPalindromicString {

    static String longestPalindrome(String s) {


        int max=Integer.MIN_VALUE;
        if(s.length()==1) return s;
        String res="";
        for (int i = 0; i < s.length()-1; i++) {
            int c=0;
            int j=0;
            if(s.charAt(i)==s.charAt(i+1)){
                while(i-j>=0 && i+j+1<s.length()){
                    if(s.charAt(i-j)==s.charAt(i+j+1)){
                        c=c+2;
                        if(c>max){
                            max=c;
                            res=s.substring(i-j,i+j+2);
                        }
                        j++;
                    }
                    else{
                        break;
                    }
                }
            }
            c=0;
            j=0;
            while(i-j>=0 && i+j<s.length()){
                if(s.charAt(i-j)==s.charAt(i+j)){
                    c=c==0?1:c+2;
                    if(c>max){
                        max=c;
                        res=s.substring(i-j,i+j+1);
                    }
                    j++;
                }
                else{
                    break;
                }
            }


        }
        return res;
    }
}
