package org.example.geeksamazon;

//https://www.geeksforgeeks.org/problems/anagram-1587115620/1
public class Anagram {

    public static boolean areAnagrams(String s1, String s2) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        if(s1.length()!=s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            freq1[(int)(s1.charAt(i))-97]++;
            freq2[(int)(s2.charAt(i))-97]++;
        }
        for (int i = 0; i < freq1.length; i++) {
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        // Your code here
        return true;
    }
}
