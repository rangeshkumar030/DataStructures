package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourDivisors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        long t=Long.parseLong(str[0]);
        for (int i = 0; i < t; i++) {
            str = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(str[0]);
            int arr[] = new int[n];
            str = br.readLine().trim().split("\\s+");
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(str[j]);
            }
            long sum=0;
            for (int j = 0; j < n; j++) {
                sum+=sumFactors(arr[j]);
            }
            System.out.println(sum);
        }
    }
    public static int sumFactors(int n){

        int sqrt= (int) Math.sqrt(n);
        //System.out.println(n+" "+sqrt);
        int sum=0;
        int count=0;
        if (sqrt*sqrt!=n){
            for (int i = 2; i <=sqrt; i++) {
                if(n%i==0){
                    sum=sum+i+(n/i);
                    count++;
                    if(count>1){
                        sum=0;
                        break;
                    }
                }
            }
           // System.out.println("count="+count+"  sum="+sum);
            if(count==1){

                sum+=1+n;
                //System.out.println("sum=="+sum);
                return sum;
            }
        }
        return 0;
    }

}
