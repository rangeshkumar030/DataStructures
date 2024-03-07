package org.example.geeksamazon;

public class MinimumPlatforms {

    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here

        int freq[]=new int[2401];
        for (int i = 0; i <n ; i++) {
            for (int j = arr[i]; j <= dep[i]; j++) {
                freq[j]++;
            }
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < 2401; i++) {
            max=Math.max(max,freq[i]);
        }
        return max;

    }
}
