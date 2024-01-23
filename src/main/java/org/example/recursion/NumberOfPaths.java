package org.example.recursion;

public class NumberOfPaths {
    public static void main(String[] args) {
        int m=3,n=3;
        System.out.println(numberOfPaths(m,n));
    }
    static long numberOfPaths(int m, int n) {
        return numberOfPaths(m,n,0,0);
    }

    private static long numberOfPaths(int m, int n, int i, int j) {
        if(i==m-1 || j==n-1){
            return 1;
        }
        return numberOfPaths(m,n,i+1,j)+numberOfPaths(m,n,i,j+1);
    }
}
