package org.example.binarysearch;

import java.util.Scanner;

public class SearchKey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int res[]=new int[t];
        for (int i = 0; i < t; i++) {
            int key=sc.nextInt();
            res[i]=binarySearch(arr,key,0,arr.length-1);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }

    }
    public static int binarySearch(int[] arr, int key,int l, int r){
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(arr[mid]==key) return mid;
        else if(arr[mid]>key) return binarySearch(arr,key,l,mid-1);
        else return binarySearch(arr,key,mid+1,r);
    }
}
