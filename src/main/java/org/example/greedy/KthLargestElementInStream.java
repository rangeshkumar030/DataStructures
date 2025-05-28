package org.example.greedy;


import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
public class KthLargestElementInStream {
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
    int k;

    public KthLargestElementInStream(int k, int[] nums) {
        this.k=k;
        pq.add(Integer.MIN_VALUE);
        for (int n:nums) {
            this.add(n);
        }
    }

    public int add(int val) {
        int leastElementInPQ=pq.peek();
        pq.add(val);
        if(pq.size()>k)
            pq.poll();
        return leastElementInPQ=pq.peek();
    }
}
