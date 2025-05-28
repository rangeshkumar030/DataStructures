package org.example.dynamicprogramming;

public class LongestPalindromicString {

    static String longestPalindrome(String s) {


        int max=Integer.MIN_VALUE;
        String res="";
        for (int i = 0; i < s.length()-1; i++) {
            int c=1;
            int j=1;
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
            c=1;
            j=1;
                while(i-j>=0 && i+j<s.length()){
                    if(s.charAt(i-j)==s.charAt(i+j)){
                        c=c+2;
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
