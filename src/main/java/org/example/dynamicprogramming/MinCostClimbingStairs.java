package org.example.dynamicprogramming;

//https://leetcode.com/problems/min-cost-climbing-stairs/description/

public class MinCostClimbingStairs {

    int min=Integer.MIN_VALUE;

    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        return minCostClimbingStairs(cost,dp,-1,0);
    }
    public int minCostClimbingStairs(int[] cost,int []dp,int i,int sum) {
        if(i>=cost.length-1){
            return sum;

        }
        return Math.min(minCostClimbingStairs(cost,dp,i+1,sum+cost[i+1]), minCostClimbingStairs(cost,dp,i+2,sum+cost[i+2]));
    }
}



