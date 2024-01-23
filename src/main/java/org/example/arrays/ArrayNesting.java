package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayNesting {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int arr[] = new int[n];
        str = br.readLine().trim().split("\\s+");
        for (int j = 0; j < n; j++){
            arr[j] = Integer.parseInt(str[j]);
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int count=0;
            if (arr[i]<0) continue;
            int index=arr[i],k=i;//index=2,j=0
            while(index!=i){
                count++;
                int f=arr[index];//1  0
                arr[index]=(k+1)*(-1); // -1 -3
                k=index;//2 1
                index=f; //index=1 0
            }
            count++;
            max=Integer.max(count,max);
        }
        System.out.println(max);
    }
}
