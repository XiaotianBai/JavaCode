package com.Algorithm.LeetCode;

public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return 0;
        int left = -1, right = -1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < prev) {
                if (left == -1) left = i - 1;
                right = i;
            }
            prev = nums[i];
        }
        if (left == -1) return 0;
        for (int i = left; i <= right; i ++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }

        for (int i = 0; i < left; i ++) {
            if (nums[i] > min) left = i;
        }
        for (int i = right + 1; i < nums.length; i++) {
            if (nums[i] < max) right = i;
        }
        return (right - left) + 1 ;
    }
}
