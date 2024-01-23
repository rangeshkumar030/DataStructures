package org.example.arrays;

import java.util.Scanner;

public class SumofAllSubarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        long arr[]=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            sum=add(sum,mul(mul(i+1,n-i),arr[i]));
        }
        System.out.println(sum);
    }
    public static long mul(long a,long b){
        long m=1000000007;
        return ((a%m)*(b%m))%m;
    }
    public static long add(long a,long b){
        long m=1000000007;
        return ((a%m)+(b%m))%m;
    }
}
