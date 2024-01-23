package org.example.recursion;

import java.util.Scanner;

public class PyramidOfGlasses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        System.out.println(countGlasses(n,t));
    }

    private static int countGlasses(int n, int t) {
        double[][] arr=new double[n][n];
        double g=t;
        if(t==1){
            return 1;
        }
        int count=0;
        populateGlasses(arr,g,n,0,0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==1) count++;
            }
        }
//        System.out.println();
//        for (int k = 0; k < n; k++) {
//            for (int l = 0; l < n; l++) {
//                System.out.print(arr[k][l]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
        return count;
    }

    private static void populateGlasses(double[][] arr, double t, int n, int i, int j) {
        //System.out.println(i+":  i  "+j+":  j  "+t+":  t ");
        if(t<=0.0) {
            return;
        }
        if(i==n){
            return;
        }

        if(arr[i][j]==1){
            populateGlasses(arr,t+0,n,i+1,j);
            populateGlasses(arr,t+0,n,i+1,j+1);
        }
        else{
            if(arr[i][j]+t/Math.pow(2,i)<=1){
                arr[i][j]+=t/Math.pow(2,i);
            }
            else{
                t-=(1d-arr[i][j])*Math.pow(2,i);
                arr[i][j]=1;
                populateGlasses(arr,t+0,n,i+1,j);
                populateGlasses(arr,t+0,n,i+1,j+1);
            }
        }
    }
}
