package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorSummation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(str[0]);
        for (int i = 0; i < t; i++) {
            str = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(str[0]);
            System.out.println(countSumDiv(n));
        }
    }
    public static long countSumDiv(int n){
        if(n==1) return 0;
        long sum=1;
        for (int i = 2; i*i <=n  ; i++) {
            if(n%i==0){
                sum+=i;
                if(n/i!=i){
                    sum+=n/i;
                }
            }
        }
        return sum;
    }
}
