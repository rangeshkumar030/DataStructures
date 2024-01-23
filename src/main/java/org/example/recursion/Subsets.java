package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int i=0;
        getSubsets(nums,list,new ArrayList<>(),i,0);
        return list;
    }
    public static void getSubsets(int[] nums, List<List<Integer>> list, List<Integer> list1, int i, int index){
        if(i==nums.length) {
            list1.subList(index, list1.size()).clear();
            list.add(new ArrayList<>(list1));
            System.out.println(list);
            return;
        }
        getSubsets(nums,list,list1,i+1,index);
        if(index< list1.size())
            list1.set(index,nums[i]);
        else list1.add(nums[i]);
        getSubsets(nums,list,list1,i+1,index+1);

    }
}
