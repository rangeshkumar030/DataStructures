package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsBitMask {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(subsets(nums));
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int i=0;
        for (int j = 0; j < Math.pow(2, nums.length); j++) {
            int[] binary=new int[nums.length];
            decimalToBinary(binary,j);
            List<Integer> temp=new ArrayList<>();
            for (int k = 0; k < binary.length; k++) {
                if(binary[k]==1) temp.add(nums[k]);
            }
            list.add(new ArrayList<>(temp));
            temp.clear();
        }
        return list;
    }
    public static int[] decimalToBinary(int[] binary, int num)
    {
        int id = 0;
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
        return binary;
    }
}
