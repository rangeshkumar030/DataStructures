package org.example.arrays;

//https://www.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
import java.util.HashMap;
import java.util.Map;

public class ExistsThreeSumEqZero {

    public boolean findTriplets(int[] arr) {
        // code here.

        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length-1; i++) {
            map.put(arr[i],0);
            for (int j = i+2; j < arr.length; j++) {
                if(map.containsKey(0-(arr[i+1]+arr[j]))) return true;
            }
        }
        return false;
    }
}
