package com.Algorithm.LeetCode;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int[] maxArr = new int[nums.length];
        int[] minArr = new int[nums.length];
        maxArr[0] = nums[0];
        minArr[0] = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            maxArr[i] = Math.max(Math.max(maxArr[i - 1] * nums[i], minArr[i - 1] * nums[i]), nums[i]);
            minArr[i] = Math.min(Math.min(maxArr[i - 1] * nums[i], minArr[i - 1] * nums[i]), nums[i]);
            if (maxArr[i] > ans) ans = maxArr[i];
        }
        return ans;
    }
}
