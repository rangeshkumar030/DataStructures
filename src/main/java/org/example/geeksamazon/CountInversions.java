package org.example.geeksamazon;
//https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?page=1&company=Amazon&sortBy=submissions
public class CountInversions {
    static long inversionCount(long arr[], long n)
    {
        long count=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n ; j++) {
                if(arr[i]>arr[j]) count ++;
            }
        }
        return count;
    }
}
