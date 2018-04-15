package com.Algorithm.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.left.left = new TreeNode(5);
        t1.right = new TreeNode(2);
        t1.left.left.right = new TreeNode(3);
        System.out.println(maxDepth(t1));
        System.out.println(simpleSolution(t1));
    }

    public static int maxDepth(TreeNode root) {
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            level++;
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode n = queue.remove();
                if (n.left != null) temp.add(n.left);
                if (n.right != null) temp.add(n.right);
            }
            if (!temp.isEmpty()) {
                level++;
                queue = temp;
            }
        }
        return level;
    }

    public static int simpleSolution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
