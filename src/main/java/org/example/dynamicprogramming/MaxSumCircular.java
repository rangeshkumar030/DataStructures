package org.example.dynamicprogramming;

//https://leetcode.com/problems/house-robber-ii/description/
public class MaxSumCircular {

    public int rob(int[] nums)
    {
        // Your code here
        int n= nums.length;
        int dp[]=new int[n+1];
        int res= FindMaxSum(nums,1,n,dp);
        dp=new int[n+1];
        res= Math.max(res,FindMaxSum(nums,0,n-1,dp));
        return res;
    }

    private int FindMaxSum(int[] arr, int i, int n, int[] dp) {
        if(n<=i) return 0;
        if(dp[n]!=0)  return dp[n];
        dp[n]=Math.max(arr[n-1]+FindMaxSum(arr, i, n-2,dp),FindMaxSum(arr, i, n-1,dp));
        return dp[n];
    }

}
