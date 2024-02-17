package org.example.geeksamazon;


//https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&company=Amazon&sortBy=submissions
public class Kadanes {

    long maxSubarraySum(int arr[], int n){

        // Your code here
        long sum=0;
        long max=Long.MIN_VALUE;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0) sum=0;
        }
        return max;

    }

}
