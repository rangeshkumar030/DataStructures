package org.example.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        permute(nums,0,list);
        return list;
    }
    public void permute(int[] nums,int i,List<List<Integer>> list) {
        if(nums.length-1==i){
            list.add(Arrays.stream(nums)
                    .boxed()
                    .collect(Collectors.toList()));
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            permute(nums,i+1,list);
            swap(nums,i,j);
        }

    }
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
