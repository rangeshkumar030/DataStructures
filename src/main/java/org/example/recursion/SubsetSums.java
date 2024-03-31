package org.example.recursion;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/subset-sums2234/1
public class SubsetSums {

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        subsetSums(arr,res,n,0,0);
        return res;
    }
    void subsetSums(ArrayList<Integer> arr,ArrayList<Integer> res, int n,int i , int sum){
        if(i==n){
            res.add(sum);
            return;
        }
        subsetSums(arr,res,n,i+1,sum);
        subsetSums(arr,res,n,i+1,sum+arr.get(i));
    }


}
