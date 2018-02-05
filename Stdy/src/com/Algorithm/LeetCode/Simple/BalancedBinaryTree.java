package com.Algorithm.LeetCode.Simple;

public class BalancedBinaryTree {
    public static void main(String[] agrs){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        root.left.left = new TreeNode(3);
        System.out.print(isBalanced(root));
    }

    private static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(findDepth(root.left, 0) - findDepth(root.right, 0)) > 1) return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int findDepth(TreeNode root, int prevDepth){
        int depth = prevDepth;
        if(root == null) return prevDepth;
        if(root.left == null && root.right == null) return prevDepth + 1;
        if(root.left != null ) depth = findDepth(root.left, prevDepth + 1);
        if(root.right != null) depth = Math.max(depth, findDepth(root.right, prevDepth + 1));
        return depth;
    }
}
