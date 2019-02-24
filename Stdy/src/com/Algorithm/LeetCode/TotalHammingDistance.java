package com.Algorithm.LeetCode;

public class TotalHammingDistance {

    public int totalHammingDistance(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j ++) {
                res += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return res;
    }

}
