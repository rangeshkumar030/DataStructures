package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindingPrimes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int primes[]=new int[1000001];
        int primesCount[]=new int[1000001];
        int count=0;
        for (int i = 2; i*i <= 1000000; i++) {

            if(primes[i]==0){
                count++;
                for (int j = i; j*i <=1000000 ; j++) {
                    primes[j*i]=1;
                }
            }
            primesCount[i]=count;
        }
        for (int i = 1001; i <= 1000000; i++) {
            if(primes[i]==0) count++;
            primesCount[i]=count;
        }

        String[] str = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(str[0]);
        for (int i = 0; i < t; i++) {
            str = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(str[0]);
            System.out.println(primesCount[n]-primesCount[n/2]);
        }
    }
}
