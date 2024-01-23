package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxGapProblemBucketing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int t = Integer.parseInt(str[0]);
        int ans[]=new int[t];
        for (int l = 0; l < t; l++) {


            str = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(str[0]);
            int arr[] = new int[n];
            str = br.readLine().trim().split("\\s+");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            if(n<2) ans[l]=0;
            else{
                int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    if (max < arr[i]) max = arr[i];
                    if (min > arr[i]) min = arr[i];
                }
                if(max==min) {ans[l]=0;continue;}
                int bucketRange = (max - min) / (n - 1);
                if ((max - min) % (n - 1) != 0) bucketRange++;
                int[][] minAndMax = new int[2][n];
                Arrays.fill(minAndMax[0], Integer.MAX_VALUE);
                Arrays.fill(minAndMax[1], Integer.MIN_VALUE);
                for (int i = 0; i < n; i++) {
                    int bucketNo = (arr[i] - min) / bucketRange;
                    if (minAndMax[0][bucketNo] > arr[i]) minAndMax[0][bucketNo] = arr[i];
                    if (minAndMax[1][bucketNo] < arr[i]) minAndMax[1][bucketNo] = arr[i];
                }
                int maxDiff = Integer.MIN_VALUE;
                max = minAndMax[1][0];

                for (int i = 1; i < n; i++) {
                    if (minAndMax[0][i] == Integer.MAX_VALUE) continue;
                    if (maxDiff < minAndMax[0][i] - max) maxDiff = minAndMax[0][i] - max;
                    max = minAndMax[1][i];
                }
                ans[l]=maxDiff;
            }

        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }

}
