package org.example.dynamicprogramming;

public class HouseRobber {

    public int rob(int[] nums){
        int arr[]=new int[nums.length+1];
        arr[1]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i+1]=Math.max(nums[i]+arr[i-1],arr[i]);
        }
        return arr[nums.length];


    }






}
