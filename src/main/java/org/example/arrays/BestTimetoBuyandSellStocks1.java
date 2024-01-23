package org.example.arrays;

import java.util.Scanner;

public class BestTimetoBuyandSellStocks1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        long ans=Long.MIN_VALUE;
        long []sMax=new long[n];
        sMax[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            sMax[i]=Math.max(sMax[i+1],arr[i]);
        }
        for (int i = 0; i < n-1; i++) {
            if(ans<(sMax[i+1]-arr[i])){
                ans=sMax[i+1]-arr[i];
            }
        }

        System.out.println(ans<0?0:ans);
    }
}
