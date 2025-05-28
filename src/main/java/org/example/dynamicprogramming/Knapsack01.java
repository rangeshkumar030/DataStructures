package org.example.dynamicprogramming;

//https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
//public class Knapsack01 {
//    static int knapSack(int W, int wt[], int val[], int n, int[][] dp)
//    {
//
//    }
//
//    static int knapSack(int W, int wt[], int val[], int n)
//    {
//        // your code here
//        if(W<0) return Integer.MIN_VALUE;
//        if(W==0) return 0;
//        if(n<1) return Integer.MIN_VALUE;
//        return Math.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1),knapSack(W,wt,val,n-1));
//    }
//}
