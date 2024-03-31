package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        int sum=0;
        combine(res,candidates,target,0,comb,sum);
        return res;
    }

    private void combine(List<List<Integer>> res, int[] candidates, int target, int i, List<Integer> comb, int sum) {
        if(sum==target) {

            res.add(comb.stream().toList());
            return;
        }

        if(i>=candidates.length || sum>target) return;

        comb.add(candidates[i]);

        System.out.println(comb);
        System.out.println("sum= "+(sum+candidates[i]));
        combine(res,candidates,target,i,comb,sum+candidates[i]);
        comb.remove(comb.size()-1);
        combine(res,candidates,target,i+1,comb,sum);

    }
}
