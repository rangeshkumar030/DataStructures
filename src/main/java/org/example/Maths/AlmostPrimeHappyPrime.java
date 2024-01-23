package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AlmostPrimeHappyPrime {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countHappyPrimes[]=new int[1000001];
        int count =0;
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
        for (int i = 6; i <= 1000000; i++) {
            countHappyPrimes[i]=countHappyPrimes[i-1];
            int n=i;
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
            if (sum==2){
                countHappyPrimes[i]++;
            }

        }
//        for (int i = 0; i < 30; i++) {
//            System.out.println(countHappyPrimes[i]+" "+i);
//        }
        String[] str = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(str[0]);
        for (int i = 0; i < t; i++) {
            str = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(str[0]);
            if(n<6){
                System.out.println(0);
            }
            else{
                System.out.println(countHappyPrimes[n]);
            }
        }
    }
}
