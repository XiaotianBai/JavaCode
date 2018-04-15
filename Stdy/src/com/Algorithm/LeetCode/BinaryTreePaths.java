package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    List<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        String s = "gg";
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        BinaryTreePaths b = new BinaryTreePaths();
        System.out.println(b.binaryTreePaths(root));
        System.out.println(s + "g");
    }

    private List<String> binaryTreePaths(TreeNode root) {
//        if(root == null) return ans;
//        StringBuilder s = new StringBuilder();
//        s.append(root.val);
//        if(root.left != null)
//            helper(s, root.left);
//        if(root.right != null)
//            helper(s, root.right);
//        if(root.left == null && root.right == null)
//            this.ans.add(Integer.toString(root.val));
//        return this.ans;
        if (root == null) return ans;
        String s = "";
        s = s + root.val;
        if (root.left != null)
            helper(s, root.left);
        if (root.right != null)
            helper(s, root.right);
        if (root.left == null && root.right == null)
            this.ans.add("" + root.val);
        return this.ans;
    }

    private void helper(String s, TreeNode t) {
        s = s + "->" + t.val;
        if (t.left != null)
            helper(s, t.left);
        if (t.right != null)
            helper(s, t.right);
        if (t.left == null && t.right == null) {
            this.ans.add(s);
        }

    }

}
