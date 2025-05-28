package org.example.Leetamazon;

import java.util.PriorityQueue;

//https://leetcode.com/problems/k-closest-points-to-origin/description/
public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res=new int[k][k];
        PriorityQueue<Point> minheap=new PriorityQueue<>((a,b)->(a.x*a.x+a.y*a.y)-(b.x*b.x+b.y*b.y));
        for (int i = 0; i < points.length; i++) {
                minheap.add(new Point(points[i][0],points[i][1]));
                if(minheap.size()>k) minheap.poll();

        }
        System.out.println(minheap);
        int i=0;
        while(minheap.isEmpty()){
            Point p=minheap.peek();
            System.out.println(p);
            res[i][0]=p.x;
            res[i++][1]=p.y;
            minheap.poll();
        }
        return res;
    }
    int distance(Point a){
        return a.x*a.x+a.y*a.y;
    }

    class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" + "x=" + x + ", y=" + y + "}";
        }
    }

}
