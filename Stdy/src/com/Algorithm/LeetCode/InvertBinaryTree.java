package com.Algorithm.LeetCode;

public class InvertBinaryTree {
    public static void main(String[] args) {

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp;

        if (root.left != null || root.right != null) {
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
        }


        return root;
    }
}
