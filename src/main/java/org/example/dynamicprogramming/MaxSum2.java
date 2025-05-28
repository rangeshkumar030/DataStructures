package org.example.dynamicprogramming;
//https://www.geeksforgeeks.org/problems/adjacents-are-not-allowed3528/1
public class MaxSum2 {


    static int maxSum(int n, int mat[][])
    {
        // code here
        int dp[]=new int[n+1];
        dp[1]=Math.max(mat[0][0],mat[1][0]);
        for (int i = 2; i < n+1; i++) {
            int sum1=0;
            if(i-2>=0) sum1=Math.max(mat[0][i-1],mat[1][i-1])+dp[i-2];
            sum1=Math.max(sum1,dp[i-1]);
            dp[i]=sum1;

        }
        return dp[n];
    }


}

