package org.example.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class EquallyDistributedGroups {
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
            HashMap<Integer,Integer> freq=new HashMap<>();
            for (int j = 0; j < n; j++) {
                if(freq.containsKey(arr[j])){
                    freq.put(arr[j],freq.get(arr[j])+1);
                }
                else{
                    freq.put(arr[j],1);
                }
            }
           // int gcd=freq.values().stream().reduce(EquallyDistributedGroups::gcd).get();

            int gcd=freq.get(arr[0]);
            for(Integer in:freq.values()){
                gcd=gcd(gcd,in);
            }
            if (gcd>1)
                System.out.println(true);
            else System.out.println(false);
        }
    }
    static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}
