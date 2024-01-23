package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RowWithMaxOnes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            str = br.readLine().trim().split("\\s+");
            for (int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        System.out.println(rowWithMax1s(arr,m,n));
    }

    static int rowWithMax1s(int arr[][], int n, int m) {
        // code here

        int maxfreqIndex=Integer.MAX_VALUE;
        int minFreq=Integer.MAX_VALUE;
        int countIfAnyOne=0;
        for (int i = 0; i < n; i++) {
            int freq=-1;
            for (int j = 0; j < m; j++) {
                if( arr[i][j]==1) countIfAnyOne++;
                if(arr[i][j]==0){
                    // System.out.println(i+" "+j);
                    freq++;


                }
            }
            if(freq<minFreq){
                //System.out.println(i+" "+freq+" "+maxfreqIndex);

                minFreq=freq;
                maxfreqIndex=i;
                //System.out.println(i+" "+freq+" "+maxfreqIndex);
            }
        }
        return countIfAnyOne==0 && maxfreqIndex==0?-1:maxfreqIndex;
    }

}
