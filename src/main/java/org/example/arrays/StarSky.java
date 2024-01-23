package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StarSky {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int q = Integer.parseInt(str[1]);
        int c=Integer.parseInt(str[2]);
        int arr[][] = new int[n][3];
        for(int i=0;i<n;i++){
            str = br.readLine().trim().split("\\s+");
            for (int j = 0; j < 3; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        int coordinates[][][]=new int[101][101][2];
        /*for (int i = 0; i < 100; i++) {
            Arrays.fill(coordinates[i],-1);
        }*/

        /*for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print( coordinates[i][j][0]+" ");
            }
            System.out.println();
        }*/
        for(int i=0;i<n;i++){
                coordinates[arr[i][0]][arr[i][1]][0]=arr[i][2];
            System.out.println(arr[i][2]);
            coordinates[arr[i][0]][arr[i][1]][1]=1;
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print( coordinates[i][j][0]+" ");
            }
            System.out.println();
        }
        System.out.println("  ========================================================================");
        for (int i = 0; i <101; i++) {
            for (int j = 1; j < 101; j++) {
                coordinates[i][j][0]=coordinates[i][j][0]+coordinates[i][j-1][0];
                coordinates[i][j][1]=coordinates[i][j][1]+coordinates[i][j-1][1];
            }
        }
       /* for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print( coordinates[i][j][0]+" ");
            }
            System.out.println();
        }*/
        for (int i = 0; i <101; i++) {
            for (int j = 1; j < 101; j++) {
                coordinates[j][i][0]=coordinates[j][i][0]+coordinates[j-1][i][0];
                coordinates[j][i][1]=coordinates[j][i][1]+coordinates[j-1][i][1];
            }
        }

         for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print( coordinates[i][j][0]+" ");
            }
            System.out.println();
        }

        long ans[]=new long[q];
        for (int i = 0; i < q; i++) {
            str = br.readLine().trim().split("\\s+");
            int t = Integer.parseInt(str[0]);
            int x1 = Integer.parseInt(str[1]);
            int y1=Integer.parseInt(str[2]);
            int x2 = Integer.parseInt(str[3]);
            int y2=Integer.parseInt(str[4]);
            long sum=0;
            sum+=(coordinates[x2][y2][0]+coordinates[x2][y2][1]*t)%(c+1);
            if(y1>1){
                sum=(sum - (coordinates[x2][y1-1][0]+coordinates[x2][y1-1][1]*t)%(c+1));
                //sum=(sum%(c+1) - (coordinates[x2][y1-1][0]+coordinates[x2][y1-1][1]*t)%(c+1))%(c+1);
            }
            if (x1>1){
                sum=(sum - (coordinates[x1-1][y2][0]+coordinates[x1-1][y2][1]*t)%(c+1));
                //sum=(sum%(c+1) - (coordinates[x1-1][y2][0]+coordinates[x1-1][y2][1]*t)%(c+1))%(c+1);
            }
            if (x1>1 && y1>1){
                sum=(sum+ (coordinates[x1-1][y1-1][0]+coordinates[x1-1][y1-1][1]*t)%(c+1));
                //sum=(sum%(c+1) + (coordinates[x1-1][y1-1][0]+coordinates[x1-1][y1-1][1]*t)%(c+1))%(c+1);
            }


            ans[i]=sum;

        }
        for (int i = 0; i < q; i++) {
            System.out.println(ans[i]);
        }
    }
}
