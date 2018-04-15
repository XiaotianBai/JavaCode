package com.Algorithm.LeetCode;

public class NumArray {
    int[] sumArr;
    int leng;
    boolean valid = true;

    public NumArray(int[] nums) {
        leng = nums.length;
        sumArr = new int[leng + 1];
        for (int i = 1; i <= leng; i++) {
            sumArr[i] = sumArr[i] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        if (i != 0) return sumArr[j + 1] - sumArr[i];
        else return sumArr[j + 1];
    }
}
