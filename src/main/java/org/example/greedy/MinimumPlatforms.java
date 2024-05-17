package org.example.greedy;

import java.util.Arrays;

//https://www.hackerrank.com/contests/kilobyte-uz-contest1/challenges/trains-and-platforms/problem
public class MinimumPlatforms {

    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int ans=0;
        int count=0;
        int i=0,j=0;
        while(i<n && j<n) {
            if(arr[i]<=dep[j]){
                count++;
                i++;
            }
            else {
                count--;
                j++;
            }

            ans=Math.max(ans,count);
        }
        return ans;

    }
}
