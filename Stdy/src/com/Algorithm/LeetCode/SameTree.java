package com.Algorithm.LeetCode;

public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left.left = new TreeNode(4);
        System.out.print(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return (p == null && q == null) || !(p == null || q == null) &&
                (p.val == q.val) && (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right));
    }
}
