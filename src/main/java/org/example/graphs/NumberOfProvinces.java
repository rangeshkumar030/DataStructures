package org.example.graphs;

import java.util.ArrayList;


//https://www.geeksforgeeks.org/problems/number-of-provinces/1
public class NumberOfProvinces {

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int ans[]=new int[1];
        int visited[]=new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if(visited[i]!=1){
                ans[0]++;
                traverse(i,adj,visited,ans);
            }
        }
        return ans[0];
    }

    private static void traverse(int i, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] ans) {
        if(visited[i]==1) return;
        visited[i]=1;
        for (int j = 0; j < adj.size(); j++) {
            if(adj.get(i).get(j)==1){
                traverse(j,adj,visited,ans);
            }
        }
    }
}
