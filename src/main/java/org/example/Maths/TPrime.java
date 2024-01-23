package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int primes[]=new int[1000001];
        int count=0;
        for (int i = 2; i*i <= 1000000; i++) {

            if(primes[i]==0){
                count++;
                for (int j = i; j*i <=1000000 ; j++) {
                    primes[j*i]=1;
                }
            }
        }
        String[] str = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(str[0]);
        for (int i = 0; i <t ; i++) {
            str = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(str[0]);
            int arr[]=new int[n];
            str = br.readLine().trim().split("\\s+");
            long sum=0;
            for (int j = 0; j < n; j++) {
                arr[j]=Integer.parseInt(str[j]);
                int sqrt= (int) Math.sqrt(arr[j]);
                System.out.println(sqrt+" "+arr[j]);
                if (sqrt*sqrt==arr[j] && primes[sqrt]==0 && arr[j]!=1){
                    System.out.println(sqrt*sqrt);
                    sum+=arr[j];
                }
            }
            System.out.println(sum);
        }
    }
}
