package com.Algorithm.LeetCode.Simple;

import java.util.Arrays;

public class ConvertArrayToBST {
    public static void main(String[] args){
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(nums);
        System.out.print(root.left.left);
    }

    public static TreeNode sortedArrayToBST(int[] nums){
        int length = nums.length;
        if(length == 0) return null;
        int mid = length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, length));
        return root;
    }
}
