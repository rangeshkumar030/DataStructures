package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonDivisors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(str[0]);
        for (int i = 0; i < t; i++) {
            str = br.readLine().trim().split("\\s+");
            long a=Long.parseLong(str[0]);
            long b=Long.parseLong(str[1]);
            long gcd=gcd(a,b);
            System.out.println(gcd);
            System.out.println(countDiv(gcd));
        }
    }
    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static long countDiv(long n){
        if(n==1) return 1;
        long sum=2;
        for (int i = 2; i*i <=n  ; i++) {
            if(n%i==0){
                sum++;
                if(n/i!=i){
                    sum++;
                }
            }
        }
        return sum;
    }
}
