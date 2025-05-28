package org.example.dynamicprogramming;


public class FindMaxSumTopBottom {
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int dp[]=new int[n+1];
        return FindMaxSum(arr,n,dp);
    }

    private int FindMaxSum(int[] arr, int n, int[] dp) {
        if(n<=0) return 0;
        if(dp[n]!=0)  return dp[n];
        dp[n]=Math.max(arr[n-1]+FindMaxSum(arr,n-2,dp),FindMaxSum(arr,n-1,dp));
        return dp[n];
    }

}
