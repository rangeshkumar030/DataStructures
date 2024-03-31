package org.example.recursion;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/sequential-digits/
public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
        int l=numOfDigits(low);
        int h=numOfDigits(high);
        for (int i = l; i <= h; i++) {
            int k=1;
            int num=0;
            int j;
            for (j = 0; j < i-1; j++) {
                k*=10;
                num=(num*10)+(j+1);
            }
            num=(num*10)+(j+1);

            //System.out.println("k:"+k+" num: "+num);
            sequentialDigits(res,low,high,k,num,num%10+1);
        }
        return res;
    }
    public void sequentialDigits(List<Integer> res,int low, int high,int k,int n,int d) {
        if(d>10) return;
        if(n>=low && n<=high)
            res.add(n);
        n=(n%k)*10+d;
        sequentialDigits(res,low,high,k,n,d+1);
    }
    public int numOfDigits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
}

