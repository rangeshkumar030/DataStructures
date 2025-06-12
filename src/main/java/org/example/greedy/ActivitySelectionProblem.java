package org.example.greedy;

import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1
public class ActivitySelectionProblem {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int arr[][]=new int[start.length][2];
        for (int i = 0; i < start.length; i++) {
            arr[i][0]=start[i];
            arr[i][1]=finish[i];
        }
        Arrays.sort(arr,(a,b)->a[1]-b[1]);

        int count=1;
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i][0]>arr[j][1]){
                count++;
                j=i;
            }
        }

    return count;
    }
}
