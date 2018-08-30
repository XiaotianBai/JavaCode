package com.Algorithm.LeetCode;

import java.util.Arrays;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, nums.length - 1, arr, nums.length, nums.length);

        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length * 2; j++) {
                if (arr[j] > nums[i]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }
}
