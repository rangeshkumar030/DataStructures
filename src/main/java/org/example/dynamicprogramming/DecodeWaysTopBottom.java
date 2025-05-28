package org.example.dynamicprogramming;

import java.util.Arrays;

//https://leetcode.com/problems/decode-ways/
public class DecodeWaysTopBottom {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()+1];
        Arrays.fill(dp,-1);
        return numDecodings(s,0,s.length(),dp);
    }
    public int numDecodings(String s,int i,int n,int[] dp) {
        if(i>=n) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i];
         dp[i]=0;

        if(s.charAt(i)>'0' && s.charAt(i)<='9'){
            System.out.println(s.charAt(i)+" here");
            dp[i]+=numDecodings(s,i+1,n,dp);
        }
        if(i<n-1 && ((s.charAt(i)=='1'  && (s.charAt(i+1)>='0' && s.charAt(i+1)<='9') )      || (s.charAt(i)=='2' && (s.charAt(i+1)>='0' && s.charAt(i+1)<='6')))) {
            System.out.println(s.charAt(i) + " here1");
            dp[i] += numDecodings(s, i + 2, n,dp);
        }

        return dp[i];
    }

}
