package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search2Dmetrix {

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
        int target = Integer.parseInt(br.readLine().trim().split("\\s+")[0]);

        boolean result=false;
        int i=0,j=n-1;
        while(j>=0 && i<m){
            if(arr[i][j]==target) {result=true; break;}
            else if (arr[i][j]>target) j--;
            else i++;
        }

    }
}
