package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class TransformAtoB {
    public static void main(String[] args) {
        int a=100,b=40021;
        transform(a,b);
    }

    private static void transform(int a, int b) {
        List<Integer> path=new ArrayList<>();
        boolean brek=false;
        try {
            transform(a,b,0, path);
        } catch (Exception e) {
            System.out.println("YES");
            System.out.println(path.size());
            System.out.println(path);
        }
        if(path.size()==0)
            System.out.println("NO");
    }

    private static void transform(int a, int b,int count, List<Integer> path) throws Exception {
        path.add(a);
        if(a==b){
            throw new Exception();
        }
        if(a>b){
            path.subList(count, path.size()).clear();
            return;
        }
        transform(a*2,b,count+1,path);
        transform(a*10+1,b,count+1,path);
        path.subList(count, path.size()).clear();
    }
}
