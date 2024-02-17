package org.example.geeksamazon;


import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&company=Amazon&sortBy=submissions
public class SubArrayGivenSum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> res=new ArrayList<Integer>();
        int start=0;
        int sum=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum>=s){
                while(s<sum && start<i)
                    sum-=arr[start++];
            }
            if(sum==s){
                res.add(start+1);
                res.add(i+1);
                return res;
            }
        }
        if(flag==false){
            res.add(-1);
        }
        return res;
    }
}
