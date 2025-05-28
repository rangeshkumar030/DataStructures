package org.example.dynamicprogramming;


//https://www.geeksforgeeks.org/problems/rod-cutting0840/1
public class RodCuttingTopBottom {

    public int cutRod(int price[], int n) {
        //code here
        int dp[]=new int[n+1];
        return cutRod(price,n,dp);
    }

    public int cutRod(int price[], int n,int[] dp) {
        if(n<=0) return 0;

        if(dp[n]!=0) return dp[n];
        for (int i = 0; i < n; i++) {
            dp[n]=Math.max(dp[n],price[i]+cutRod(price,n-i-1,dp));
        }
        return dp[n];
    }
}
