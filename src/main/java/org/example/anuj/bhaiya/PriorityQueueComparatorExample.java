package org.example.anuj.bhaiya;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueComparatorExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->b-a);
        heap.addAll(List.of(1,2,3,4,5,6,7,8,9));
        while(!heap.isEmpty()){
            System.out.println(heap.poll());
        }
    }
}
