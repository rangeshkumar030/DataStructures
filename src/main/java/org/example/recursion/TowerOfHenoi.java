package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHenoi {
    static int count=0;
    public static void main(String[] args) {
        int N = 2, n = 2;
        System.out.println(shiftPile(N,n));
    }
    static void towerOfHanoi(int N, int  source, int helper, int destination,ArrayList<Integer> list,int n,count c) {
        if (N == 0) {
            return;
        }
        towerOfHanoi(N - 1, source, destination, helper,list,n,c);
        c.count++;
        if(c.count==n){
            list.add(source);
            list.add(destination);
            return;
        }
        towerOfHanoi(N - 1, helper, source, destination,list,n,c);
    }
    static List<Integer> shiftPile(int N, int n){
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        towerOfHanoi(N, 1, 2, 3, list, n,new count());
        return list;
    }
}
class count{
    int count = 0;
}
