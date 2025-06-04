package org.example.arrays;


//https://leetcode.com/problems/next-permutation/submissions/1652269189/
//https://www.geeksforgeeks.org/problems/next-permutation5226/1
public class NextPermutation {

    void nextPermutation(int[] arr) {
        // code here
        int pivot=-1;
        for (int i = arr.length-1; i >=1; i--) {
            if(arr[i]>arr[i-1]){
                pivot=i-1;
                break;
            }
        }

        if(pivot!=-1) {
            int greater = pivot;
            int min=Integer.MAX_VALUE;
            for (int i = pivot + 1; i < arr.length; i++) {
                if (arr[i]>arr[pivot] && arr[i]<min){
                    greater=i;
                    min=arr[i];

                }
            }

            swap(arr,pivot,greater);
        }
        int n=arr.length-1;
        while(pivot+1<n){
            swap(arr,pivot+1,n);
            pivot++;
            n--;
        }

    }

    void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
