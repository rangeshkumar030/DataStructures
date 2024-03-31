package org.example.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combinations/description/
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        combine(res,n,k,1,comb);
        return res;
    }
    public void combine(List<List<Integer>> res,int n, int k,int i,List<Integer> comb ) {
        if(k==0){
            res.add(comb.stream().toList());
            return;
        }
        if(i>n){
            return;
        }
        comb.add(i);
        combine(res,n,k-1,i+1,comb);
        comb.remove(comb.size()-1);
        combine(res,n,k,i+1,comb);
    }
}
