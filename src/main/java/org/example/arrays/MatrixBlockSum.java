package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixBlockSum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int k = Integer.parseInt(str[2]);
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            str = br.readLine().trim().split("\\s+");
            for (int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        //calculate presum
        int preSum[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j==0){
                    preSum[i][j]=arr[i][j];
                }
                else
                    preSum[i][j]=preSum[i][j-1]+arr[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j==0){
                    preSum[j][i]=preSum[j][i];
                }
                else
                    preSum[j][i]=preSum[j-1][i]+preSum[j][i];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(preSum[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        long answer[][] = new long[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ti=i-k<0?0:i-k;
                int tj=j-k<0?0:j-k;
                int bi=i+k>=m?m-1:i+k;
                int bj=j+k>=n?n-1:j+k;
                System.out.println(ti+","+tj+","+bi+","+bj+",  k="+k);
                long sum=0;
                sum+=preSum[bi][bj];
                if (tj>0)
                    sum-=preSum[bi][tj-1];
                if(ti>0)
                    sum-= preSum[ti-1][bj];
                if(ti>0 && tj>0)
                    sum+=preSum[ti-1][tj-1];
                answer[i][j]=sum;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }
}
