package org.example.dynamicprogramming;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/cutted-segments1642/1
public class MaximizeTheCutSegmentsTopBottom {
    public int maximizeCuts(int n, int x, int y, int z)
    {
        //Your code here
        int []dp=new int[n+1];

        for (int i = 1; i <= n; i++) {
            if(i-x<0 || dp[i-x]<0){
                dp[i]=Integer.MIN_VALUE;
            }
            if(i-y<0 || dp[i-y]<0){
                dp[i]=Integer.MIN_VALUE;
            }
            if(i-z<0 || dp[i-z]<0){
                dp[i]=Integer.MIN_VALUE;
            }
            if(i-x>=0 )
                dp[i]=Math.max(dp[i],1+dp[i-x]);
            if(i-y>=0 )
                dp[i]=Math.max(dp[i],1+dp[i-y]);
            if(i-z>=0 )
                dp[i]=Math.max(dp[i],1+dp[i-z]);
        }

        return dp[n];



    }


}
