package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialContest {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        long t=Long.parseLong(str[0]);
        for (int i = 0; i < t; i++) {
            str = br.readLine().trim().split("\\s+");
            long n=Long.parseLong(str[0]);
            long a = Long.parseLong(str[1]);
            long b = Long.parseLong(str[2]);
            long k=Long.parseLong(str[3]);
            long sum=n/a+n/b-2*n/((a*b)/gcd(a,b));
            System.out.println(sum>=k?"Win":"Lose");
        }

    }
    public static long gcd(long a,long b){
        long min=a<b?a:b;
        long max=a>b?a:b;
        while(max%min!=0){
            long temp=max;
            max=min;
            min=temp%min;
        }
        return min;
    }
}
