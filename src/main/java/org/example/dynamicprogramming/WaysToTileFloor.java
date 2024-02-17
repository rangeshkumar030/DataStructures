package org.example.dynamicprogramming;

//https://www.geeksforgeeks.org/problems/ways-to-tile-a-floor5836/1

import java.util.Arrays;

public class WaysToTileFloor {

    static Long numberOfWays(int n) {
        // code here
        long []arr=new long[n+2];
        Arrays.fill(arr,-1);
        return countWays(n,arr);
        // your code here
    }
    static long countWays(int n, long []arr){
        if(n==0) return 1;
        if(n<0) return 0;
        if(arr[n]!=-1) return arr[n];
        arr[n]=mod(mod(countWays(n-1,arr))+mod(countWays(n-2,arr)));
        return arr[n];
    }
    static long mod(long n){
        return n%1000000007;
    }
}
