package org.example.dynamicprogramming;


//https://leetcode.com/problems/minimum-sideway-jumps/description/
public class MinimumSidewayJumps {

    public int minSideJumps(int[] obstacles) {
        int dp[][]=new int[obstacles.length+1][4];
        return minSideJumps(obstacles,0,2,dp);
    }
    public int minSideJumps(int[] obstacles,int i,int lane,int dp[][]) {
        if(dp[i][lane]!=0){
            return dp[i][lane];
        }
        if(i==obstacles.length-2 && obstacles[i+1]==lane){
            dp[i][lane]=1;
            return 1;
        }
        if(i==obstacles.length-1){
            dp[i][lane]=0;
            return 0;
        }
        if(obstacles[i+1]==lane){
            switch (lane){
                case 1:
                    int val=Integer.MAX_VALUE;
                    if(obstacles[i]!=2){
                        val=Math.min(val,minSideJumps(obstacles,i+1,2,dp));
                    }
                    if(obstacles[i]!=3){
                        val=Math.min(val,minSideJumps(obstacles,i+1,3,dp));
                    }
                    dp[i][lane]=val+1;
                    return 1+val;
                case 2:
                    val=Integer.MAX_VALUE;
                    if(obstacles[i]!=1){
                        val=Math.min(val,minSideJumps(obstacles,i+1,1,dp));
                    }
                    if(obstacles[i]!=3){
                        val=Math.min(val,minSideJumps(obstacles,i+1,3,dp));
                    }
                    dp[i][lane]=val+1;
                    return 1+val;
                    case 3:
                        val=Integer.MAX_VALUE;
                        if(obstacles[i]!=1){
                            val=Math.min(val,minSideJumps(obstacles,i+1,1,dp));
                        }
                        if(obstacles[i]!=2){
                            val=Math.min(val,minSideJumps(obstacles,i+1,2,dp));
                        }
                        dp[i][lane]=val+1;
                        return 1+val;            }
        }
        dp[i][lane]=minSideJumps(obstacles,i+1,lane,dp);
        return dp[i][lane];

    }
}
