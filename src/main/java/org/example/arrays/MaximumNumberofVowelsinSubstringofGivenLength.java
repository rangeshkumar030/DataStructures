package org.example.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumNumberofVowelsinSubstringofGivenLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        String[][] str =new String[t][2];
        for (int i = 0; i < t; i++) {
            str[i] = br.readLine().trim().split("\\s+");
        }
        for (int i = 0; i < t; i++) {
            int k= Integer.parseInt(str[i][1]);
            int freq=0,maxfreq=0;
            char[] arr=str[i][0].toCharArray();
            for (int j = 0; j < k; j++) {
                if(isVowel(arr[j])) freq++;
            }
            maxfreq=freq;
            for (int j = k; j < arr.length; j++) {
                if(isVowel(arr[j-k])) freq--;
                if(isVowel(arr[j])) freq++;
                if (maxfreq<freq) maxfreq=freq;
            }
            System.out.println(maxfreq);
        }

    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) return true;
        return false;
    }
}
