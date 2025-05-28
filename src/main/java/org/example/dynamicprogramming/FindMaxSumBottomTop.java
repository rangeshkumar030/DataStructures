package org.example.dynamicprogramming;


//https://www.geeksforgeeks.org/problems/stickler-theif-1587115621/1
public class FindMaxSumBottomTop {
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int dp[]=new int[n+1];
        dp[1]=arr[0];
        for (int i = 2; i < n+1; i++) {
            int sum1=0;
            if(i-2>=0) sum1=arr[i-1]+dp[i-2];
            sum1=Math.max(sum1,dp[i-1]);
            dp[i]=sum1;

        }
        return dp[n];
    }
}

