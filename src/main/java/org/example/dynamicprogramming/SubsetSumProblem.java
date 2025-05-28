package org.example.dynamicprogramming;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
public class SubsetSumProblem {
    static Boolean isSubsetSum(int i, int arr[], int n){
        // code here
        int[][] dp=new int[i+1][n+1];
        for (int j = 0; j < i+1; j++) {
            Arrays.fill(dp[j],-1);
        }
        return isSubsetSum(i,arr,n,dp);
    }

    static Boolean isSubsetSum(int i, int arr[], int n,int[][] dp){
        // code here
        if(n<0) return false;
        if(n==0) return true;
        if(i<1) return false;
        if(dp[i][n]!=-1) return dp[i][n]!=0?true:false;
        boolean ans= isSubsetSum(i-1,arr,n-arr[i-1],dp) || isSubsetSum(i-1,arr,n,dp);
        dp[i][n]=ans==true?1:0;
        return ans;
    }

}
