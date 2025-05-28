package org.example.dynamicprogramming;


//https://codeforces.com/contest/474/problem/D
public class FlowerArray {

    public static void main(String[] args) {
        int k=4,n=4;
        int ways[]=new int[n+1];
        ways[0]=1;
        for (int i = 1; i < n+1; i++) {
            ways[i]+=ways[i-1];
            if(i-k>=0){
                ways[i]+=ways[i-k];
            }
        }
        System.out.println(ways[n]);
    }
}
