package com.Algorithm.LeetCode;


public class TreeToString {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        System.out.println(treeToString(root));
    }

    public static String treeToString(TreeNode t) {
        StringBuilder str = new StringBuilder();
        str = treeToString(str, t);
        str.deleteCharAt(0);
        str.setLength(str.length() - 1);
        return str.toString();
    }

    private static StringBuilder treeToString(StringBuilder str, TreeNode t) {
        if (t == null) {
            str.append("()");
            return str;
        } else str.append("(" + t.val);
        if (t.right != null) {
            str = treeToString(str, t.left);
            str = treeToString(str, t.right);
        } else if (t.left != null) {
            str = treeToString(str, t.left);
        }
        str.append(")");
        return str;
    }

}
