package org.example.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
//https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
public class JobSequencingProblem {
    public  ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<Integer> res=new ArrayList<>(Arrays.asList(0, 0));
        int arr[][]=new int[deadline.length][2];
        for (int i = 0; i < deadline.length; i++) {
            arr[i][0]=deadline[i];
            arr[i][1]=profit[i];
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] job: arr) {
            if (job[0] > pq.size()) {
                pq.add(job[1]);
            }
            else if (!pq.isEmpty() && pq.peek() < job[1]) {
                pq.poll();
                pq.add(job[1]);
            }
        }

        while (!pq.isEmpty()) {
            res.set(1, res.get(1) + pq.poll());
            res.set(0, res.get(0) + 1);
        }

        return res;

    }

    public static void main(String[] args) {

    }

    void printarr(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
