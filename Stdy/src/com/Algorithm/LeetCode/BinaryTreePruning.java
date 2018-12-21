package com.Algorithm.LeetCode;

public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        if (root.left != null) {
            root.left = pruneTree(root.left);
        }
        if (root.right != null) {
            root.right = pruneTree(root.right);
        }
        if (root.left == null && root.right == null) {
            return root.val == 0 ? null : root;
        }
        return root;
    }

    private boolean hasOne(TreeNode root) {
        if (root.val == 1) return true;
        if (root.left != null && hasOne(root.left)) return true;
        return root.right != null && hasOne(root.right);
    }
}
