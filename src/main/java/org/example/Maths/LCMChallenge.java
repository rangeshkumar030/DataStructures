package org.example.Maths;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCMChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []str=br.readLine().trim().split("\\s+");
        long n=Long.parseLong(str[0]);
        if (n<=2){
            System.out.println(n);
        }
        else if(n==3){
            System.out.println(6);
        }
        else{
            if(n%2==0 && n%3==0) n--;
            long gcdFirstTwo=gcd(n,n-1);
            //System.out.println(gcdFirstTwo);
            long third=1;
            for (long i = n%2==0?n-3:n-2; i >=1; i--) {
                //System.out.println(i+" ");
                if(gcd(gcdFirstTwo,i)==1){
                    //System.out.println("here"+i);
                    third=i;
                    break;
                }
            }
            //System.out.println("th:"+third);
            System.out.println(n*(n-1)*third);
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
