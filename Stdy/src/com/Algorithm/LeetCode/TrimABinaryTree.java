package com.Algorithm.LeetCode;

public class TrimABinaryTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(1);
        t1.right = new TreeNode(4);
        t1.left.right = new TreeNode(2);
        TreeNode t3 = trimBST(t1, 3, 4);
        System.out.print(t3.val);


    }

    public static TreeNode trimBST(TreeNode root, int L, int R) {
        if (root != null && root.left != null) root.left = trimBST(root.left, L, R);
        if (root != null && root.right != null) root.right = trimBST(root.right, L, R);
//        if(root != null && root.left != null && (root.left.val < L || root.left.val > R))
//            root.left = root.left.left == null? root.left.right : root.left.left;
//        if(root != null && root.right != null && (root.right.val < L || root.right.val > R))
//            root.right = root.right.left == null? root.right.right : root.right.left;
        if (root != null && (root.val < L || root.val > R))
            root = root.left == null ? root.right : root.left;

        return root;
    }
}
