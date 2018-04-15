package com.Algorithm.LeetCode;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums, 6));
    }

    private static double findMaxAverage(int[] nums, int k) {
        double max;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += (nums[i] - nums[i - k]);
            if (sum > max) max = sum;
        }
        return max / k;
    }
}
