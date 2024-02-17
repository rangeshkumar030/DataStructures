package org.example.dynamicprogramming;


// https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1

public class WaysToReachStairsBottomTop {
    int countWays(int n)
    {
        int a=1,b=2;
        if(n<=2) return n;
        for(int i=3;i<=n;i++){
            int temp=mod(mod(a)+mod(b));
            a=b;
            b=temp;
        }
        // your code here
        return b;
    }

    int mod(int n){
        return n%1000000007;
    }
}
