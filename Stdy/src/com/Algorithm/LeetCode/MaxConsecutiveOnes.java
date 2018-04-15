package com.Algorithm.LeetCode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int ans = 0;
        for (int n : nums) {
            if (n == 1) temp += 1;
            else {
                if (temp > ans) ans = temp;
                temp = 0;
            }
        }
        if (temp > ans) ans = temp;
        return ans;
    }
}
