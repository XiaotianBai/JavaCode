package com.Algorithm.LeetCode;

import java.util.*;

public class BinTreeLvlOrderTraversalII {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        List<List<Integer>> ans = levelOrderBottom(root);
        List<Integer> cur = new ArrayList<>();
        System.out.println(ans.get(0));
        System.out.println(ans.get(1));
        System.out.println(ans.get(2));

    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> curLevel = new LinkedList<>();
        curLevel.add(root);
        while(!curLevel.isEmpty()) {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            List<Integer> cur = new ArrayList<>();
            while (!curLevel.isEmpty()) {
                TreeNode node = curLevel.remove();
                cur.add(node.val);
                if (node.left != null) nextLevel.add(node.left);
                if (node.right != null) nextLevel.add(node.right);
            }

            ans.add(cur);
            curLevel = nextLevel;
        }
        Collections.reverse(ans);
        return ans;
    }
}