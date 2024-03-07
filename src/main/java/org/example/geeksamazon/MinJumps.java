package org.example.geeksamazon;
//https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&company=Amazon&sortBy=submissions
public class MinJumps {
    static int min=Integer.MAX_VALUE;
    static int minJumps(int[] arr){
        // your code here
        minJumps(arr,1,0);
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }

    static void minJumps(int[] arr,int jumps, int i){
        if(arr[i]==0) return;
        if(jumps>=min) return;
        if(i+arr[i]>=arr.length-1){
            //System.out.println(jumps+" "+ i);
            //jumps++;
            min=Math.min(min,jumps);
            return;
        }
        for (int j =i+arr[i] ; j >=i+1 && j<arr.length ; j--) {
            minJumps(arr,jumps+1,j);

        }
    }
}
