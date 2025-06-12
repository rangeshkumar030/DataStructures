package org.example.arrays;


//https://www.geeksforgeeks.org/problems/largest-sum-subarray-of-size-at-least-k3121/1
public class LargestSumSubarrayofSizeatleastK {

    public long maxSumWithK(long a[], long n, long k) {

        long sum=0;
        long maxSum=Integer.MIN_VALUE;
        long i=0,j=0;
        for (int l = 0; l < k; l++) {
            sum+=a[l];
        }
        maxSum=Math.max(sum,maxSum);
        for (long l = k; l < n; l++) {
            sum+=a[(int) l];
            maxSum=Math.max(sum,maxSum);
            j+=a[(int) i];
            i++;
            if(j<0){
                sum-=j;
                maxSum=Math.max(sum,maxSum);
                j=0;
            }
        }
    return maxSum;
    }
}
