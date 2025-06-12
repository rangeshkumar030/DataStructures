package org.example.trees;

//https://www.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1
public class KthAncestorInTree {

     int kth;
    public int kthAncestor(Node root, int k, int node) {
        // Write your code here
        int res[]=new int[1];
        kth=k;
        kthAncestor(root,node,res);
        return res[0];

    }

    public int kthAncestor(Node root,  int node,int res[]) {
        // Write your code here
        if(root==null) return -1;
        if(root.data==node) return node;
        int val=Math.max(kthAncestor(root.left,node,res),kthAncestor(root.right,node,res));
        if(res[0]!=0) return -1;
        if(val!=-1) kth--;
        if(kth==0) res[0]=root.data;
        return val;
    }



    class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }
}
