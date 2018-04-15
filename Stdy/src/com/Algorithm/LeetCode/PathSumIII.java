package com.Algorithm.LeetCode;

public class PathSumIII {
    int ans = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(3);
        root.right.left.left = new TreeNode(-1);
        root.right.left.left.right = new TreeNode(1);
        PathSumIII pathSumIII = new PathSumIII();
        System.out.println(pathSumIII.pathSum(root, 6));
    }

    private int pathSum(TreeNode root, int sum) {
        if (root == null) return ans;
        helper(root, sum, 0);
        if (root.left != null) pathSum(root.left, sum);
        if (root.right != null) pathSum(root.right, sum);
        return ans;
    }

    private void helper(TreeNode root, int sum, int prev) {
        int cur = prev + root.val;
        if (cur == sum) ans++;
        if (root.left != null) helper(root.left, sum, cur);
        if (root.right != null) helper(root.right, sum, cur);
    }
}
