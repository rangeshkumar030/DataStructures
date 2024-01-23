package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HardestProblemEver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        long t=Long.parseLong(str[0]);
        for (int i = 0; i < t; i++) {
            str = br.readLine().trim().split("\\s+");
            int n=Integer.parseInt(str[0]);
            int arr[]=new int[n];
            str = br.readLine().trim().split("\\s+");
            for (int j = 0; j < n; j++) {
                arr[j]=Integer.parseInt(str[j]);
            }
            System.out.println(findDivisibles(arr,n));
        }
    }
    public static int findDivisibles(int arr[],int n){
        int totalcount=0;
        int gcd=gcd(arr[0],arr[1]);
        for (int j = 2; j < n; j++) {
            gcd=gcd(gcd,arr[j]);
        }
        //System.out.println(totalcount);
        if ( gcd==1) return 1;
        return 0;
    }
    public static int gcd(int a,int b){
        int min=a<b?a:b;
        int max=a>b?a:b;
        while(max%min!=0){
            int temp=max;
            max=min;
            min=temp%min;
        }
        return min;
    }
}
