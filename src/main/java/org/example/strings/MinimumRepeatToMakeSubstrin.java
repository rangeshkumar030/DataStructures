package org.example.strings;

//https://www.geeksforgeeks.org/problems/minimum-times-a-has-to-be-repeated-such-that-b-is-a-substring-of-it--170645/1
public class MinimumRepeatToMakeSubstrin {

    static int minRepeats(String s1, String s2) {
        // code here
        int n=s1.length();
        int m=s2.length();
        int x=(m+n-1)/n;
        int lps[]=new int[m];
        compareLPS(s2,lps);
        if(issubstring(s1,s2,x,lps)) return x;
        if(issubstring(s1,s2,x+1,lps)) return x+1;
        return -1;


    }

    static void compareLPS(String s, int arr[]){
        int len=0;
        int i=1;
        int n=arr.length;
        arr[0]=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                arr[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=arr[len-1];
                }
                else{
                    arr[i]=0;
                    i++;
                }
            }
        }
    }


    static boolean issubstring(String s1, String s2, int rep, int lps[]){
        int n=s1.length();
        int m=s2.length();
        int i=0,len=0;
        while(i<n*rep){
            if(s1.charAt(i%n)==s2.charAt(len)){
                i++;
                len++;
                if(len==m){
                    return true;
                }
            }
            else{
                if(len!=0)
                    len=lps[len-1];
                else i++;
            }
        }
        return false;
    }


}
