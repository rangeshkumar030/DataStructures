package org.example.dynamicprogramming;

//https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1

// top bottom approach

import java.util.Arrays;

public class WaysToReachStairs {
    int countWays(int n)
    {
        int []arr=new int[n+2];
        Arrays.fill(arr,-1);
        return countWays(n,arr);
        // your code here
    }
    int countWays(int n, int []arr){
        if(n==0) return 1;
        if(n<0) return 0;
        if(arr[n]!=-1) return arr[n];
        arr[n]=mod(mod(countWays(n-1,arr))+mod(countWays(n-2,arr)));
        return arr[n];
    }
    int mod(int n){
        return n%1000000007;
    }

}
