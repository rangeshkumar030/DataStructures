package org.example.binarysearch;

import java.util.Scanner;

public class FindFrequency {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int res[][]=new int[t][2];
        for (int i = 0; i < t; i++) {
            int key=sc.nextInt();
            res[i][0]=FirstPosition(arr,key,0,arr.length-1);
            res[i][1]=LastPosition(arr,key,0,arr.length-1);
        }
        for (int i = 0; i < t; i++) {
            if(res[i][0]==-1) System.out.println(0);
            else System.out.println(res[i][1]-res[i][0]);
        }

    }

    private static int LastPosition(int[] arr, int key, int l, int r) {
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(arr[mid]==key && mid==arr.length-1) return mid;
        else if(arr[mid]==key && arr[mid+1]!=key) return mid;
        else if(arr[mid]==key && arr[mid+1]==key) return LastPosition(arr,key,mid+1,r);
        else if(arr[mid]>key) return LastPosition(arr,key,l,mid-1);
        else return LastPosition(arr,key,mid+1,r);
    }

    public static int FirstPosition(int[] arr, int key,int l, int r){
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(arr[mid]==key && mid==0) return mid;
        else if(arr[mid]==key && arr[mid-1]!=key) return mid;
        else if(arr[mid]==key && arr[mid-1]==key) return FirstPosition(arr,key,l,mid-1);
        else if(arr[mid]>key) return FirstPosition(arr,key,l,mid-1);
        else return FirstPosition(arr,key,mid+1,r);
    }
}
