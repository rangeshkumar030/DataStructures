package org.example.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlyonaAndFlowers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int arr[]=new int[n];
        int preSum[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(i==0) preSum[i]=arr[i];
            else preSum[i]=preSum[i-1]+arr[i];
        }
        int choices[][]=new int[3][m];
        for (int i = 0; i < m; i++) {
            choices[0][i]= sc.nextInt();
            choices[1][i]= sc.nextInt();
            choices[2][i]=choices[0][i]==1?preSum[choices[1][i]-1]:preSum[choices[1][i]-1]-preSum[choices[0][i]-2];
        }
        System.out.println(Arrays.stream(choices[2]).filter(num->num>0).sum());
    }
}
