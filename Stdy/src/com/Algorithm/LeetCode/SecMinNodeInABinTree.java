package com.Algorithm.LeetCode;

public class SecMinNodeInABinTree {
    int ans = -1;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        SecMinNodeInABinTree sec = new SecMinNodeInABinTree();
        System.out.print(sec.findSecondMinimumValue(root));
    }

    private int findSecondMinimumValue(TreeNode root) {
        findAns(root, root.val);
        return ans;
    }

    private void findAns(TreeNode root, int val) {
        if (root.val == val) {
            if (root.left != null) findAns(root.left, val);
            if (root.right != null) findAns(root.right, val);

        } else ans = ans == -1 ? root.val : Math.min(root.val, ans);

    }
}
