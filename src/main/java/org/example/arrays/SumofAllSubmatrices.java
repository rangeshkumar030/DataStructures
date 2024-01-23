package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SumofAllSubmatrices {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        long arr[][] = new long[m][n];
        for(int i=0;i<m;i++){
            str = br.readLine().trim().split("\\s+");
            for (int j = 0; j < n; j++){
                arr[i][j] = Long.parseLong(str[j]);
            }
        }
        long sum=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum=add(sum,mul(mul(mul(i+1,j+1),mul(m-i,n-j)),arr[i][j]));
            }
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
