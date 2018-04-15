package com.Algorithm.LeetCode;

import java.util.ArrayList;

public class GreaterTree {
    static int sum = 0;

    public static void main(String[] args) {
        //Important : BST structure(the  right side is greater than root while the left side smaller than root)
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);
        root = simpleSolution(root);
        System.out.println(root.val + " " + root.left.val + " " + root.right.val);

    }

    public static TreeNode simpleSolution(TreeNode root) {
        helper(root);
        return root;
    }

    private static void helper(TreeNode root) {
        if (root == null) {
            return;
        }

        helper(root.right);
        int temp = root.val;
        root.val += sum;
        sum += temp;
        helper(root.left);
    }

    public static TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        ArrayList<Integer> arr = new ArrayList<>();
        convertBST(arr, root);
        System.out.println(arr);
        convertBSTHelper(arr, root);
        return root;
    }

    private static ArrayList convertBST(ArrayList<Integer> arr, TreeNode root) {
        arr.add(root.val);
        if (root.left != null) convertBST(arr, root.left);
        if (root.right != null) convertBST(arr, root.right);
        return arr;
    }

    private static TreeNode convertBSTHelper(ArrayList<Integer> arr, TreeNode root) {
        int current = root.val;
        for (Integer i : arr) {
            if (i > current) root.val += i;
        }
        if (root.left != null) convertBSTHelper(arr, root.left);
        if (root.right != null) convertBSTHelper(arr, root.right);
        return root;
    }


}
