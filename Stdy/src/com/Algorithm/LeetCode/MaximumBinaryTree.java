package com.Algorithm.LeetCode;

import java.util.Arrays;

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper2(nums);
    }

    private int[] helper(int[] numArray) {
        int max = numArray[0];
        int pos = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
                pos = i;
            }

        }
        return new int[]{pos, max};
    }

    private TreeNode helper2(int[] nums) {
        int[] temp = helper(nums);
        TreeNode root = new TreeNode(temp[1]);
        if (temp[0] >= 1) {
            int[] left = Arrays.copyOfRange(nums, 0, temp[0]);
            root.left = helper2(left);
        }

        if (nums.length > temp[0] + 1) {
            int[] right = Arrays.copyOfRange(nums, temp[0] + 1, nums.length);
            root.right = helper2(right);
        }
        return root;
    }
}
