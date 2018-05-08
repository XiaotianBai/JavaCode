package com.Algorithm.LeetCode;

public class PathSum {
    public static void main(String[] args) {

    }

    private static boolean hasPathSum(TreeNode root, int sum) {
        return root != null && helper(root, sum, 0);
    }

    private static boolean helper(TreeNode root, int sum, int cur) {
        int curSum = cur + root.val;
        if (root.left == null && root.right == null) return curSum == sum;
        if (root.left != null) if (helper(root.left, sum, curSum)) return true;
        return root.right != null && helper(root.right, sum, curSum);
    }
}
