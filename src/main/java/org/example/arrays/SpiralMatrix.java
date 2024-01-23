package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiralMatrix {
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

        if(m!=1 && n!=1){
            int i=0,j=0;
            //char dir[]={'r','d','l','u'};
            String dir="rdlurdlu";
            char curDir='r';
            int direc[][]={{0,1},{1,0},{0,-1},{-1,0}};

            while(i>=0 && j>=0 && i<m && j<n){
                System.out.print(arr[i][j]+" ");

                if(i+direc[dir.indexOf(curDir)%4][0]==m || j+direc[dir.indexOf(curDir)%4][1]==n ||
                        i+direc[dir.indexOf(curDir)%4][0]<0 || j+direc[dir.indexOf(curDir)%4][1]<0
                        || arr[i+direc[dir.indexOf(curDir)%4][0]][j+direc[dir.indexOf(curDir)%4][1]]>100){
                    curDir=dir.charAt(dir.indexOf(curDir)+1);
                }
                arr[i][j]=101;
                i+=direc[dir.indexOf(curDir)%4][0];
                j+=direc[dir.indexOf(curDir)%4][1];
                if(arr[i][j]>100)
                    break;

            }
        }
        if(m==1){
            for (int i = 0; i < n; i++) {
                System.out.print(arr[0][i]+" ");
            }

        } else if (n==1) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][0]+" ");
            }
        }


    }

}
/*
(arr[i+direc[dir.indexOf(curDir)%4][0]][j+direc[dir.indexOf(curDir)%4][0]]<101 ) &&
        (arr[i+direc[(dir.indexOf(curDir)+1)%4][0]][j+direc[(dir.indexOf(curDir)+1)%4][0]]<101 )*/
