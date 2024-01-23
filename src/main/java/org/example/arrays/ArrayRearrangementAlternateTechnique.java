package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRearrangementAlternateTechnique {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int arr[] = new int[n];
        str = br.readLine().trim().split("\\s+");
        for (int j = 0; j < n; j++){
            arr[j] = Integer.parseInt(str[j]);
        }
        for (int i = 0; i < n; i++) {
            int old_val= arr[i]%n;
            arr[old_val]=n*i+arr[old_val];
        }
        for (int i = 0; i < n; i++) {
            arr[i]=arr[i]/n;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
