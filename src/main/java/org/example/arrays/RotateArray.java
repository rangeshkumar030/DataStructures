package org.example.arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        k=k%n;
        long arr[]=new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextLong();
        }
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverse(long arr[],int l,int r){
        for (int i = l; i <=r ; i++,r--) {
            long temp=arr[i];
            arr[i]=arr[r];
            arr[r]=temp;
        }
    }
}
