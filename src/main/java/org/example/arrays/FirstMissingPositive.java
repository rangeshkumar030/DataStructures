package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstMissingPositive {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int t=Integer.parseInt(str[0]);
        for (int i = 0; i < t; i++) {
            System.out.println(missingPositive(br));
        }

    }
    public static int missingPositive(BufferedReader br) throws IOException {
        String[] str = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int arr[] = new int[n+1];
        str = br.readLine().trim().split("\\s+");
        for (int j = 0; j < n; j++){
            arr[j] = Integer.parseInt(str[j]);
        }

        for (int j = 0; j < n; j++) {
            if(arr[j]<0 || arr[j]>=n) continue;
            int index=arr[j];
            while(index!=j && index>=0 && index<=n){
                int temp=arr[index];
                if(arr[index]==index) break;
                arr[index]=index;
                index=temp;
            }
            if(index==j && index>=0 )
                arr[index]=index;
        }
        /*for (int j = 0; j < n ; j++) {
            System.out.print(arr[j]+" ");
        }*/
        int j;
        for (j = 1; j <=n; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        if( j==n+1){
            return j;
        }
        return 1;
    }
}


