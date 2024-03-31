package org.example.arrays;


public class SubarraySumEqualsKPositives {

    public static int subarraySum(int[] nums, int k) {
        int sum=nums[0];
        int i=0,j=0,count=0;
        while(j<nums.length-1){
            System.out.println(i+" "+j+" "+sum);
            if(sum==k){
                count++;
                j++;
                sum+=nums[j];
                sum-=nums[i];
                i++;
                continue;
            }
            if(sum>k){
                if(i==j){
                    j++;
                    sum+=nums[j];
                    continue;
                }
                sum-=nums[i];
                i++;
                continue;
            }
            if(sum<k){
                j++;
                sum+=nums[j];
            }
        }
        while(i<=j){
            if(sum==k) count++;
            sum-=nums[i];
            i++;
        }
        return count;
    }



}
