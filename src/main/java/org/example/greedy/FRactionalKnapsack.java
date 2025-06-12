package org.example.greedy;


import java.util.Arrays;
import java.util.Comparator;

//https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
public class FRactionalKnapsack {

    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here

        double w=W;
        int arr[][]=new int[values.length][values.length];
        for (int i = 0; i < values.length; i++) {
            arr[i]=new int[]{values[i],weights[i]};
        }
        //Arrays.sort(arr,(a, b)-> (int) ((b[0]/b[1])-(a[0]/a[1])));
        Arrays.sort(arr, Comparator.comparingDouble(a-> (1.0*a[0])/a[1]));
        double totalprofit=0.0;
        // printarr(arr);

        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i][1]<=w){
                totalprofit+=arr[i][0];
                w-=arr[i][1];
            }
            else{
                totalprofit+=(w/arr[i][1])*arr[i][0];
                break;
            }
        }
        return totalprofit;
    }

    void printarr(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
