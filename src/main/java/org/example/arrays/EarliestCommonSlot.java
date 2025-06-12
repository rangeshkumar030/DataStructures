package org.example.arrays;

//https://www.geeksforgeeks.org/problems/earliest-common-slot/1
import java.util.Collections;
import java.util.List;

public class EarliestCommonSlot {
    public int[] commonSlot(List<int[]> a, List<int[]> b, int d) {
        // code here
        Collections.sort(a,(x,y)->x[0]-y[0]);
        Collections.sort(b,(x,y)->x[0]-y[0]);
        int p1=0,p2=0;
        while(p1<a.size() && p2<b.size()){
            if(Math.min(a.get(p1)[1],b.get(p2)[1])-Math.max(a.get(p1)[0],b.get(p2)[0])>=d){
                return new int[]{Math.min(a.get(p1)[1],b.get(p2)[1]),Math.max(a.get(p1)[0],b.get(p2)[0])};
            }
            if(a.get(p1)[1]>=b.get(p2)[1]){
                p2++;
            }
            else {
                p1++;
            }
        }
        return new int[]{};
    }
}
