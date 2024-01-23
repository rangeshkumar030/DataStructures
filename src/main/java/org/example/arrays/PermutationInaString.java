package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationInaString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine().trim());
        String [][]arr=new String[n][2];
        for (int i = 0; i < 2*n; i++) {
            arr[i/2][i%2] = br.readLine().trim();
        }
        for (int i = 0; i < n; i++) {
            int ls=arr[i][1].length(),lk=arr[i][0].length();
            boolean result=false;
            for (int j = 0; j <= ls-lk; j++) {
                if(isPermutation(arr[i][1].substring(j,j+lk),arr[i][0])){
                    result = true;
                }
            }
            System.out.println(result?"True":"False");
        }

    }
    public static boolean isPermutation(String arr, String key){
        int[] freqArr=new int[256];
        for (int i = 0; i < arr.length(); i++) {
            freqArr[arr.charAt(i)-97]++;
        }
        for (int i = 0; i < key.length(); i++) {
            freqArr[key.charAt(i)-97]--;
        }
        for (int i = 0; i < 256; i++) {
            if(freqArr[i]!=0)
                return false;
        }
        return true;
    }
}

