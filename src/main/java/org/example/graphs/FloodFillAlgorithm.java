package org.example.graphs;


//https://www.geeksforgeeks.org/problems/flood-fill-algorithm1856/1
public class FloodFillAlgorithm {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here

        int visited[][]=new int[image.length][image[0].length];
        int oldColor=image[sr][sc];
        floodFill(image,sr,sc,newColor,oldColor,visited);
        return image;
    }

    private void floodFill(int[][] image, int sr, int sc, int newColor, int oldColor,int visited[][]) {

        if(sr<0 || sc<0 || sr> image.length-1 || sc > image[0].length-1) return;
        if(visited[sr][sc]==1) return;
        visited[sr][sc]=1;
        if(image[sr][sc]!=oldColor) return;
        image[sr][sc]=newColor;
        floodFill(image,sr-1,sc,newColor,oldColor,visited);
        floodFill(image,sr,sc-1,newColor,oldColor,visited);
        floodFill(image,sr,sc+1,newColor,oldColor,visited);
        floodFill(image,sr+1,sc,newColor,oldColor,visited);
    }
}
