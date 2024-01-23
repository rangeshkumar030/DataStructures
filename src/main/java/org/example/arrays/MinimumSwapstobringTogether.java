package org.example.arrays;

import java.util.Scanner;

public class MinimumSwapstobringTogether {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long arr[]=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<=k) count++;
        }
        int freq=0;
        for (int i = 0; i < count; i++) {
            if(arr[i]<=k) freq++;
        }
        int maxFreq=freq;
        for (int i = count; i < n; i++) {
            if(arr[i-count]<=k) freq--;
            if(arr[i]<=k)  freq++;
            if (maxFreq<freq) maxFreq=freq;
        }
        System.out.println(count-maxFreq);
    }
}
