package org.example.arrays;

//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/
public class MakeTwoArraysEqualbyReversingSubarrays {

    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length) return false;
        int freq1[]=new int[1000];
        for (int i = 0; i < target.length; i++) {
            freq1[target[i]]++;
            freq1[arr[i]]--;
        }
        for (int i = 0; i < freq1.length; i++) {
            if(freq1[i]!=0) return false;
        }
        return true;
    }
}
