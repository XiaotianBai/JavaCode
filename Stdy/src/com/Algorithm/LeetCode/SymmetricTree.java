package com.Algorithm.LeetCode;

public class SymmetricTree {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(2);
        System.out.print(isSymmetric(root));
    }

    private static boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        else if(root.left != null && root.right == null) return false;
        else if(root.left == null) return false;
        return helper(root.left, root.right);
    }

    private static boolean helper(TreeNode left, TreeNode right){
        if(left.val != right.val) return false;
        if(left.left != null && right.right == null) return false;
        if(left.left == null && right.right != null) return false;
        if(left.right != null && right.left == null) return false;
        if(left.right == null && right.left != null) return false;
        if(left.left != null) {
            if(!helper(left.left, right.right)) return false;
        }
        if(left.right != null){
            if(!helper(left.right, right.left)) return false;
        }
        return true;
    }
}
