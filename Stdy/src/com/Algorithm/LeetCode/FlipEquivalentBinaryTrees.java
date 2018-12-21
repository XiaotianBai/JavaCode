package com.Algorithm.LeetCode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class FlipEquivalentBinaryTrees {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2 == null;
        if (root2 == null) return false;
        if (root1.val != root2.val) return false;
        if (root1.left == null && root1.right == null) {
            return root2.left == null && root2.right == null;
        } else if (root1.left != null && root1.right == null) {
            if (root2.left != null && root2.right == null) return flipEquiv(root1.left, root2.left);
            if (root2.left == null && root2.right != null) return flipEquiv(root1.left, root2.right);
            else return false;
        } else if (root1.left == null) {
            if (root2.left != null && root2.right == null) return flipEquiv(root1.right, root2.left);
            if (root2.left == null && root2.right != null) return flipEquiv(root1.right, root2.right);
            else return false;
        } else return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) ||
                (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
    }
}
