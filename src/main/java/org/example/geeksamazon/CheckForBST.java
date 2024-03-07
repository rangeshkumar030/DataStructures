package org.example.geeksamazon;

public class CheckForBST {

    boolean isBST(Node root)
    {
        // code here.
        return isBST(root, Integer.MAX_VALUE,Integer.MIN_VALUE);
    }

     boolean isBST(Node root, int maxValue, int minValue) {
        if(root==null) return true;
        if(root.data<minValue || root.data>maxValue) return false;
        return isBST(root.left, root.data-1,minValue) && isBST(root.right,maxValue, root.data+1);
    }

}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
