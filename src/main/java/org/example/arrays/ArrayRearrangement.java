package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRearrangement {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int arr[] = new int[n];
        str = br.readLine().trim().split("\\s+");
        for (int j = 0; j < n; j++){
            arr[j] = Integer.parseInt(str[j]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]<0) continue;
            int index=arr[i],k=i;//index=2,j=0
            while(index!=i){
                int f=arr[index];//1  0
                arr[index]=(k+1)*(-1); // -1 -3
                k=index;//2 1
                index=f; //index=1 0
            }
            arr[index]=(k+1)*(-1);
        }
        for (int i = 0; i < n; i++) {
            arr[i]=(arr[i]*-1)-1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
