package org.example.dynamicprogramming;


//https://www.geeksforgeeks.org/problems/rod-cutting0840/1
public class RodCuttingBottomTop {

    public int cutRod(int price[], int n) {
        //code here
        int dp[]=new int[n+1];
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i]=Math.max(dp[i], price[j]+dp[i-j-1]);
            }
        }
        return dp[n];
    }

}
