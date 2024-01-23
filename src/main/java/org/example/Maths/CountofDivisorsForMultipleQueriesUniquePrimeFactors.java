package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountofDivisorsForMultipleQueriesUniquePrimeFactors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int primes[]=new int[1000001];
        int spf[]=new int[1000001];
        Arrays.fill(spf,-1);
        for (int i = 2; i*i <= 1000000; i++) {
            if(primes[i]==0){
                for (int j = i; j*i <=1000000 ; j++) {
                    if (primes[j*i]==0){
                        spf[j*i]=i;
                    }
                    primes[j*i]=1;
                }
            }
        }
        String[] str = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(str[0]);
        for (int k = 0; k < t; k++) {
            str = br.readLine().trim().split("\\s+");
            int num = Integer.parseInt(str[0]);
            str = br.readLine().trim().split("\\s+");
            int arr[]=new int[num];
            for (int i = 0; i <num ; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            for (int i = 0; i < num; i++) {
                int n=arr[i];
                int factor=spf[n];
                int sum=0;
                while(spf[n]!=-1){
                    n=n/spf[n];
                    if (factor!=spf[n]){
                        if(factor==n) {n=1;}
                        sum++;
                        factor=spf[n];
                    }
                }
                if(n!=1){
                    sum++;
                }
                arr[i]=sum;
            }
            for (int i = 0; i < num; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
}
