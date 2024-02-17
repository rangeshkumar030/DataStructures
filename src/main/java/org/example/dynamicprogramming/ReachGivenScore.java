package org.example.dynamicprogramming;

import java.util.Arrays;

public class ReachGivenScore {

    static int count=0;

    static int sum=0;
    static public long count(int n) {
        // Add your code here.
        long arr[]= new long[n+1];
        Arrays.fill(arr,-1);
        int []score=new int[3];
        score[0]=3;
        score[1]=5;
        score[2]=10;
        count(n,0, arr,score);
        return count;

    }
    static public void count(int n,int i, long[]arr ,int []score){
        if(sum==n) {
            count++;
            i++;
            return;
        }
        if(sum>n){
            i++;
            return;
        }

        for(int k=i;k<3;k++){
            sum+=score[k];
            count(n,i,arr,score);
            sum-=score[k];
        }

    }

    public static void main(String[] args) {
       long a= count(17);
        System.out.println(a +"--------------");
    }
}
