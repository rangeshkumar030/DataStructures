package org.example.dynamicprogramming;


//https://www.geeksforgeeks.org/problems/longest-repeating-subsequence2004/1
public class LongestRepeatingSubsequence {

    public int LongestRepeatingSubsequence(String s) {
        // code here


        int dp[][]=new int[s.length()+1][s.length()+1];

        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j  < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    dp[i+1][j+1]=dp[i][j]+1;
                }
                else {
                    dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }

        return dp[s.length()-1][s.length()];
    }
}
