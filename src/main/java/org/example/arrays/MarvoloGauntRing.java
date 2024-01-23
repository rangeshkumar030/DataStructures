package org.example.arrays;

import java.util.Scanner;


public class MarvoloGauntRing {
    public static void main(String[] args) {
        long ans=Long.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long p=sc.nextLong();
        long q=sc.nextLong();
        long r=sc.nextLong();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long[] preMax=new long[n];
        preMax[0]=arr[0]*p;
        for(int i=1;i<n;i++){
            if(preMax[i-1]<arr[i]*p){
                preMax[i]=arr[i]*p;
            }
            else{
                preMax[i]=preMax[i-1];
            }
        }
        long sMax=r*arr[n-1];
        long mid;
        for(int i=n-1;i>=0;i--){
            mid=q*arr[i];
            if(ans<(mid+sMax+preMax[i])){
                ans=mid+sMax+preMax[i];
            }
            if(sMax<arr[i]*r){

                sMax=arr[i]*r;

            }
        }
        for (long i = 0; i < preMax.length; i++) {
        }
        System.out.print(ans);
    }
}