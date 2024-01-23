package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RangeSumQuery2DImmutable {

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
        int q = Integer.parseInt(br.readLine().trim().split("\\s+")[0]);
        int queries[][]=new int[q][4];
        for (int i = 0; i < q; i++) {
            str = br.readLine().trim().split("\\s+");
            queries[i][0]=Integer.parseInt(str[0]);
            queries[i][1]=Integer.parseInt(str[1]);
            queries[i][2]=Integer.parseInt(str[2]);
            queries[i][3]=Integer.parseInt(str[3]);
        }
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

        for (int i = 0; i < q; i++) {
            long sum=0;
            sum+=preSum[queries[i][2]][queries[i][3]];
            if (queries[i][1]>0)
                sum-=preSum[queries[i][2]][queries[i][1]-1];
            if(queries[i][0]>0)
                sum-= preSum[queries[i][0]-1][queries[i][3]];
            if(queries[i][0]>0 && queries[i][1]>0)
                sum+=preSum[queries[i][0]-1][queries[i][1]-1];
            System.out.println(sum);
        }
    }
}
