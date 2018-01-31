package com.Algorithm.LeetCode.Simple;

public class MergeTwoBinaryTrees {
    public static void main(String[] args)
    {
      //   [1,3,2,5]
      //   [2,1,3,null,4,null,7]
      //  [3,4,5,5,4,null,7]
      TreeNode t1 = new TreeNode(1);
      t1.left = new TreeNode(3);
      t1.left.left = new TreeNode(5);
      t1.right = new TreeNode(2);
      TreeNode t2 = new TreeNode(2);
      t2.left = new TreeNode(1);
      t2.right = new TreeNode(3);
      t2.left.right = new TreeNode(4);
      t2.right.right = new TreeNode(7);
      TreeNode t3 = mergeTrees(t1,t2);
      System.out.print(t3.val);
      System.out.print(t3.left.val);
      System.out.print(t3.right.val);
      System.out.print(t3.left.left.val);
      System.out.print(t3.left.right.val);
      System.out.print(t3.right.left.val);
      System.out.print(t3.right.right.val);

    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2)
    {
        if(t2 == null ) return t1;
        if(t1 == null ) return t2;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
