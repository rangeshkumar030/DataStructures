package org.example.dynamicprogramming;
//https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
import java.util.Arrays;

public class MinimumJumps {

    static int minJumps(int[] arr) {
        // code here
        int ans[]=new int[arr.length];
        Arrays.fill(ans,-1);
        if(arr[0]!=0){
            ans[0]=0;
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <= i+arr[i] && j<arr.length; j++) {
                if(ans[j]==-1 && ans[i]!=-1){
                    ans[j]=ans[i]+1;
                }
            }

        }

        return ans[ans.length-1];
    }
}
