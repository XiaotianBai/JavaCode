package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TwoSumIV {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(-4);
        root.left.right = new TreeNode(1);

        int k = -1;
        System.out.println(findTarget(root, k));
    }

    public static boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> nums = new ArrayList<>();
        while (!queue.isEmpty()) {

            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode n = queue.remove();
                if (n.left != null) {
                    int i = n.left.val;
                    if (nums.contains(i)) return true;
                    else {
                        temp.add(n.left);
                        nums.add(k - n.left.val);
                    }
                }
                if (n.right != null) {
                    int i = n.right.val;
                    if (nums.contains(i)) return true;
                    else {
                        temp.add(n.right);
                        nums.add(k - n.right.val);
                    }
                }
            }
            System.out.println(nums);
            queue = temp;
        }
        return false;
    }

}
