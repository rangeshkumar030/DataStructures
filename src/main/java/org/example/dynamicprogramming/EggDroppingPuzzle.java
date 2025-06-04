package org.example.dynamicprogramming;


import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/egg-dropping-puzzle-1587115620/1
public class EggDroppingPuzzle {

    static int eggDrop(int n, int k){
        int dp[][]=new int[n+1][k+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i],-1);
        }
        return eggDrop(n,k,dp);
    }
    static int eggDrop(int n, int k,int dp[][]) {
        // code here
        if(dp[n][k]!=-1) return dp[n][k];
        int res=Integer.MAX_VALUE;
        if(k<=1) return k;
        if (n==1) return k;


        for (int i = 1; i <= k; i++) {
            res=Math.min(res,Math.max(eggDrop(n-1,i-1,dp),eggDrop(n,k-i,dp)));
        }
        dp[n][k]=1+res;
        return dp[n][k];
    }
}
