package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MajorityElement1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int arr[] = new int[n];
        str = br.readLine().trim().split("\\s+");
        for (int j = 0; j < n; j++){
            arr[j] = Integer.parseInt(str[j]);
        }

        int c = 0, candidate = -1;

        for (int i = 0; i < n; i++) {
            if (c == 0) {
                candidate = arr[i];
                c = 1;
            }
            else {
                if (arr[i] == candidate)
                    c++;
                else
                    c--;
            }
        }

        System.out.println(candidate);

    }
}
