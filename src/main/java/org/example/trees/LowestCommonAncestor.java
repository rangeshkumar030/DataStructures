package org.example.trees;


//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/1646760078/
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        if(root==null) return null;

        if(root.val==n1.val) return root;
        if(root.val==n2.val) return root;
        TreeNode ln=lowestCommonAncestor(root.left,n1,n2);
        TreeNode rn=lowestCommonAncestor(root.right,n1,n2);
        if(ln!=null && rn!=null ) return root;
        else if(ln!=null) return ln;
        else return rn;

    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
}
