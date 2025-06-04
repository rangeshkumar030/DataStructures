package org.example.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class WordBreak {

    static boolean wordBreak(String s, String[] dictionary)
    {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (String w : dictionary) {
                int start = i - w.length();
                if (start >= 0 && dp[start] && s.startsWith(w,start)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }



// public boolean wordBreak(String s, String[] dictionary) {
    //     // code here
    //     boolean dp[]=new boolean[s.length()+1];
    //     return wordBreak(s,dictionary,0,dp);
    // }

    // public boolean wordBreak(String s, String[] dictionary , int i,boolean dp[]) {
    //     // code here
    //     if(i==s.length()) return true;
    //     if(dp[i]) return true;

    //     for (int k = 0; k < dictionary.length; k++) {
    //         if(i+dictionary[k].length()<=s.length() && s.substring(i,i+dictionary[k].length()).equals(dictionary[k])){
    //             boolean ans= wordBreak(s,dictionary,i+dictionary[k].length(),dp);
    //             if(ans==true){
    //                 dp[i]=true;
    //             }
    //         }
    //     }
    //     return dp[i];
    // }


//    public boolean wordBreak(String s, String[] dictionary) {
//        // code here
//        boolean dp[]=new boolean[s.length()+1];
//        int maxwordlen=Integer.MIN_VALUE;
//        HashSet<String> set=new HashSet<>(Arrays.asList(dictionary));
//        for (int i = 0; i < dictionary.length; i++) {
//            maxwordlen=Math.max(dictionary[i].length(),maxwordlen);
//        }
//        return wordBreak(s,set,0,dp,maxwordlen);
//    }
//
//    public boolean wordBreak(String s, HashSet<String> set , int i,boolean dp[],int maxwordlen) {
//        // code here
//        if(i==s.length()) return true;
//        if(dp[i]) return true;
//        String pre="";
//        for (int j = 0; i+j < s.length() && j<maxwordlen+1; j++) {
//            pre+=s.charAt(i+j);
//            if(set.contains(pre)){
//                dp[i]|=wordBreak(s,set,i+j+1,dp,maxwordlen);
//            }
//        }
//        return dp[i];
//    }



}
