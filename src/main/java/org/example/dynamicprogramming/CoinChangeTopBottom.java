package org.example.dynamicprogramming;

//https://leetcode.com/problems/coin-change/
public class CoinChangeTopBottom {

    public static int coinChange(int[] coins, int amount) {
        long [][]dp = new long[coins.length][amount+1];
        long ans=coinChange(coins, amount,dp,coins.length-1);
        return (ans<0 || ans==Integer.MAX_VALUE)?-1:(int)ans;
    }

    public static long coinChange(int[] coins, int amount, long [][]dp, int i) {
        if(amount==0) return 0;
        if(amount<0) return Integer.MAX_VALUE;
        if(i<0) return Integer.MAX_VALUE;
        if (dp[i][amount]!=0) return dp[i][amount];
        dp[i][amount]=Math.min(1+coinChange(coins, amount-coins[i],dp,i),coinChange(coins, amount,dp,i-1));
        return  dp[i][amount];

    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5},11));
    }
}
