package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrimeFactorizationMultipleQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int primes[]=new int[1000001];
        int spf[]=new int[1000001];
        Arrays.fill(spf,-1);
        for (int i = 2; i*i <= 1000000; i++) {
            if(primes[i]==0){
                for (int j = i; j*i <=1000000 ; j++) {
                    if (primes[j*i]==0) spf[j*i]=i;
                    primes[j*i]=1;
                }
            }
        }
        for (int i = 0; i < 10000; i++) {
            if(spf[i]==0)
                System.out.println(i);
        }
        String[] str = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(str[0]);
        for (int i = 0; i < t; i++) {
            str = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(str[0]);
            int factor=spf[n],count=0;
            while(spf[n]!=-1){
                n=n/spf[n];
                count++;
                if (factor!=spf[n]){
                    if(factor==n) {count++;n=1;}
                    System.out.println(factor+" "+count);
                    factor=spf[n];
                    count=0;
                }
            }
            if(n!=1){
                    System.out.println(n+" "+1);
            }
        }
    }
}
