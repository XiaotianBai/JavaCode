package com.Algorithm.LeetCode;

public class NonDecresingArray {
    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) return true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                if (checkAfterResolving(nums)) {
                    return true;
                } else {
                    nums[i] = temp;
                    nums[i + 1] = temp;
                }
                return (checkAfterResolving(nums));
            }
        }
        return true;
    }

    private boolean checkAfterResolving(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) return false;
        }
        return true;
    }
}
