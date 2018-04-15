package com.Algorithm.LeetCode;

public class MinimumDepthofBinaryTree {
    public static void main(String[] args) {
        MinimumDepthofBinaryTree test = new MinimumDepthofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(2);
        root.right.right.left = new TreeNode(2);
        System.out.print(test.minDepth(root));
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return helper(root, 1);
    }

    private int helper(TreeNode root, int depth) {
        int ld = Integer.MAX_VALUE, rd = Integer.MAX_VALUE;
        if (root.left == null && root.right == null) return depth;
        if (root.left != null) ld = helper(root.left, depth + 1);
        if (root.right != null) rd = helper(root.right, depth + 1);
        return Math.min(ld, rd);
    }


}
