package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        long arr[][] = new long[n][m];
        for(int i=0;i<n;i++){
            str = br.readLine().trim().split("\\s+");
            for (int j = 0; j < m; j++){
                arr[i][j] = Long.parseLong(str[j]);
            }
        }
    }


    public BufferedReaderInput() throws IOException {
    }
}
