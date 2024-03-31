package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii/description/
public class CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        int sum=0;
        combine(res,n,k,1,comb,sum);
        return res;
    }
    public void combine(List<List<Integer>> res,int n, int k,int i,List<Integer> comb , int sum) {
        if(k==0 && sum==n){
            res.add(comb.stream().toList());
            return;
        }
        if(i>9){
            return;
        }
        if(k<0 || sum > n) return;
        comb.add(i);
        combine(res,n,k-1,i+1,comb,sum+i);
        comb.remove(comb.size()-1);
        combine(res,n,k,i+1,comb,sum);
    }

}
