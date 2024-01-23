package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int[] arr=new int[6];
        arr[0]=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[j]<1) break;
                System.out.print(arr[j]+" ");
            }
            System.out.println();

            int temp=arr[0];
            for (int j = 1; j < n; j++) {
                int temp1=arr[j];
                arr[j]=arr[j]+temp;
                temp=temp1;
            }
        }

    }
}
