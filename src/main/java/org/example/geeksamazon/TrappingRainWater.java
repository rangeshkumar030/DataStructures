package org.example.geeksamazon;
//https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?page=1&company=Amazon&sortBy=submissions
public class TrappingRainWater {

    static long trappingWater(int arr[], int n) {
        // Your code here
        long ans=0;
        long pMax[]=new long[n];
        long sMax[]=new long[n];
        pMax[0]=arr[0];
        sMax[n-1]=arr[n-1];
        for (int i = 1; i < n; i++) {
            pMax[i]=Math.max(arr[i],pMax[i-1]);
            sMax[n-i-1]=Math.max(arr[n-i-1],arr[n-i]);
        }
        for (int i = 1; i < n-1; i++) {
            ans+=Math.min(sMax[i],pMax[i])-arr[i]>0?Math.min(sMax[i],pMax[i])-arr[i]:0;
        }
        return ans;
    }
}
