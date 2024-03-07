package org.example.geeksamazon;
//https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&company=Amazon&sortBy=submissions
public class EquilibriumPoint {

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int i=0, j=n-1;
        long sum1=arr[i],sum2=arr[j];
        while(j>=i){
            if(i==j && sum1==sum2){
                return i+1;
            }
            if(sum1>sum2){
                j--;
                sum2+=arr[j];
            }
            else if(sum1<sum2){
                i++;
                sum1+=arr[i];
            }
            else{
                i++;
                j--;
                sum2+=arr[j];
                sum1+=arr[i];
            }

        }
        return -1;
    }
}
