package org.example.arrays;

import java.util.Scanner;

public class MaxChunksToMakeSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        long pMax[]=new long[n];
        pMax[0]=arr[0];
        long ans=0;
        for (int i = 1; i < n; i++) {
            pMax[i]=Math.max(pMax[i-1],arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if(pMax[i]==i) ans++;
        }
        System.out.println(ans);
    }
}
