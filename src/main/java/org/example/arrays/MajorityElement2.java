package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MajorityElement2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(str[0]);
        for (int i = 0; i <t ; i++) {
            str = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(str[0]);
            int arr[] = new int[n];
            str = br.readLine().trim().split("\\s+");
            for (int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(str[j]);
            }
            int c = 0, candidate = -1;

            for (int j = 0; j < n; j++) {
                if (c == 0) {
                    candidate = arr[j];
                    c = 1;
                }
                else {
                    if (arr[j] == candidate)
                        c++;
                    else
                        c--;
                }
            }
            c = 0;int candidate2 = -1;

            for (int j = 0; j < n; j++) {
                if (arr[j]==candidate) continue;
                if (c == 0) {
                    candidate2 = arr[j];
                    c = 1;
                }
                else {
                    if (arr[j] == candidate2)
                        c++;
                    else
                        c--;
                }
            }
            int max=Integer.max(candidate2,candidate);
            int min=Integer.min(candidate2,candidate);
            int count1=0,count2=0;
            if(min!=-1){

                for (int j = 0; j < n; j++) {
                    if(arr[j]==min) count1++;
                }
                if (count1>n/3)
                    System.out.print(min+" ");
            }
            if(max!=-1){

                for (int j = 0; j < n; j++) {
                    if(arr[j]==max) count2++;
                }
                if (count2>n/3)
                    System.out.print(max+" ");
            }
            if(count1>n/3 && count2<n/3)
                System.out.println(-1);

        }

    }
}
