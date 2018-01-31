package com.Algorithm.LeetCode.Simple;

public class BinaryTreeTilt {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        System.out.println(findTilt(root));

    }

    public static int findTilt(TreeNode root){
        if(root == null) return 0;
        int sum = 0, left = 0, right = 0;
        if(root.left != null) sum += findTilt(root.left);
        if(root.right != null) sum += findTilt(root.right);
        if(root.left != null){
            left = root.left.val;
            root.val += left;
        }
        if(root.right != null){
            right = root.right.val;
            root.val += right;
        }
        sum += Math.abs(left - right);
        return sum;
    }

}
