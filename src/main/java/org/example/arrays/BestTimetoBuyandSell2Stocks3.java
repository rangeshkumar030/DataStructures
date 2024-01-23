package org.example.arrays;

import java.util.Scanner;

public class BestTimetoBuyandSell2Stocks3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        long ans=Long.MIN_VALUE;
        long preProfit[]=new long[n];
        long preMin=arr[0];
        long sufMax[]=new long[n];
        sufMax[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            sufMax[i]=Math.max(sufMax[i+1],arr[i]);
        }
        for (int i = 1; i < n; i++) {
            if(arr[i]-preMin>0){
                preProfit[i]=Math.max(preProfit[i-1],arr[i]-preMin);
            } else if (preProfit[i-1]>0) {
                preProfit[i]=preProfit[i-1];
            }
            preMin=Math.min(preMin,arr[i]);
        }
        if(n<4) System.out.println(preProfit[n-1]);
        else{
            for (int i = 2; i < n-1; i++) {
                if(preProfit[i]==0) continue;
                else{
                    ans=Math.max(ans,preProfit[i]+sufMax[i+1]-arr[i]);
                }
            }
            System.out.println(ans<0?0:ans);
        }

    }
}




//for (int i = 1; i < n-3; i++) {
//        preMin[i]=Math.min(preMin[i-1],arr[i]);
//        if(arr[i]-preMin[i-1]>0){
//        profit1=Math.max(profit1,arr[i]-preMin[i-1]);
//        for (int j = i+1; j < n-1; j++) {
//        if (sufMax[j+1]-arr[j]>0)
//        profit2=Math.max(profit2,sufMax[j+1]-arr[j]);
//        }
//        }
//        }
//        if(profit2<0 || profit1<0) System.out.print(0);
//        else System.out.print(profit2+profit1);