package com.Algorithm.LeetCode.Simple;

public class SumOfLeftLeaves {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(sumOfLeftLeaves(root));
    }

    public static int sumOfLeftLeaves(TreeNode root){
        if(root == null) return 0;
        int sum = 0;
        if(root.left != null){
            sum += sumOfLeftLeavesHelper(root.left);
            sum += sumOfLeftLeaves(root.left);
        }
        if(root.right != null)sum += sumOfLeftLeaves(root.right);
        return sum;
    }
    private static int sumOfLeftLeavesHelper(TreeNode root)
    {
        if(root.left == null && root.right == null) return root.val;
        else return 0;
    }
}
