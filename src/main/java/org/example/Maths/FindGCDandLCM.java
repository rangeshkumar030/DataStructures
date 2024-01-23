package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindGCDandLCM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        long a = Integer.parseInt(str[0]);
        long b = Integer.parseInt(str[1]);
        long min=a<b?a:b;
        long max=a>b?a:b;
        long gcd;
        long lcm;
        while(max%min!=0){
            long temp=max;
            max=min;
            min=temp%min;
        }
        gcd=min;
        lcm=(a*b)/gcd;
        System.out.println(gcd+" "+lcm);
    }
}
