package org.example.trees;

//https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1
public class KthSmallestInBST {


    public int kthSmallest(Node root, int k){
        int res[]=new int[1];
        res[0]=0;
        return kthSmallestRecur(root,res,k);
    }
    public int kthSmallestRecur(Node root, int[] cnt, int k) {
        if (root == null) return -1;

        int left = kthSmallestRecur(root.left, cnt, k);

        if (left != -1) return left;

        cnt[0]++;

        if (cnt[0] == k) return root.data;

        int right = kthSmallestRecur(root.right, cnt, k);
        return right;
    }


    class Node
     {
         int data;
         Node left, right;

         public Node(int d)
         {
             data = d;
             left = right = null;
         }
     }
}
