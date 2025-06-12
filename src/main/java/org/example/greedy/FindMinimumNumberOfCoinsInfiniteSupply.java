package org.example.greedy;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
public class FindMinimumNumberOfCoinsInfiniteSupply {
    static List<Integer> minPartition(int N) {
        // code here
        int coins[]=new int[]{ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        List<Integer> res=new ArrayList<>();
        int sum=N;
        for (int i = coins.length-1; i >=0 ; i--) {
            if(sum>0){
                while(coins[i]<=sum){
                    sum-=coins[i];
                    res.add(coins[i]);
                }
            }
            if(sum==0) break;
        }
    return res;
    }
}
