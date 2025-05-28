package org.example.dynamicprogramming;

import java.util.Arrays;

public class ReachGivenScore {


    static public long count(int n) {
        // Add your code here.
        long arr[][]= new long[n+1][4];
        Arrays.fill(arr[0],1);
        int []score=new int[3];
        score[0]=3;
        score[1]=5;
        score[2]=10;

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < 4; j++) {
                arr[i][j]+=arr[i][j-1];
                if(i-score[j-1]>=0){
                    arr[i][j]+=arr[i-score[j-1]][j];
                }
            }
        }
        return arr[n][3];
    }
}
