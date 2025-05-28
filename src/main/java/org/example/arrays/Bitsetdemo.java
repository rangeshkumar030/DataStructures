package org.example.arrays;

import java.util.BitSet;

public class Bitsetdemo {
    public static void main(String[] args) {
        BitSet bitSet=new BitSet(10);
        int arr[]=new int[]{1,2,3,4,4,6,7,1,2,3};
        for (int i = 0; i < 10; i++) {
            bitSet.set(arr[i]-1);
        }
        System.out.println(bitSet);
        System.out.println(bitSet.get(2));
    }
}
