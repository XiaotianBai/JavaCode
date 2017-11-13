package com.Algorithm.LeetCode;

public class MinimumMovesToEqualAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.print(minMoves(nums));
    }

    public static int minMoves(int[] nums) {
        int moves = 0, min = nums[0];
        for (int i : nums) {
            if (i < min) min = i;
            moves += i;
        }
        moves -= min * nums.length;
        return moves;
    }
}
