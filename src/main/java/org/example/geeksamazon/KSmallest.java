package org.example.geeksamazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&company=Amazon&sortBy=submissions
public class KSmallest {

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        int res=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < r+1; i++) {
            list.add(arr[i]);
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>(list);
        for (int i = 0; i < k; i++) {
           res= queue.poll();
        }

        return res;
    }
}
