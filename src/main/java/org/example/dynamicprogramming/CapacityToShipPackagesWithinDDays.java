package org.example.dynamicprogramming;


//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
public class CapacityToShipPackagesWithinDDays {

    public static int shipWithinDays(int[] weights, int days) {
        int presum[]=new int[weights.length];

        presum[0]=weights[0];
        for (int i = 1; i < weights.length; i++) {
            presum[i]+=presum[i-1];
        }
        return shipWithinDays(weights,days,0,weights.length-days,presum);

    }
    public static int shipWithinDays(int[] weights, int days,int l,int r,int presum[]) {
        //if(days==0) return Integer.MIN_VALUE;
        if(days==1) return presum[weights.length-1]-presum[l-1];
        int min=Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            int max;
            if(l==0){
                max=presum[i];
            }
            else{
                max=presum[i]-presum[l-1];
            }
            max=Math.max(max,shipWithinDays(weights,days-1,i+1,weights.length-days,presum));
            min=Math.min(min,max);
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10},5));
    }
}
