package com.Algorithm.LeetCode;

public class CountingBits {
    public int[] countBits(int num) {
        if (num == 0) return new int[]{0};
        int[] ans = new int[num + 1];
        ans[0] = 0;

        int curBit = 1;
        for (int i = 1; i < num + 1; i++) {
            if (i < curBit * 2) {
                ans[i] = 1 + ans[i - curBit];
            } else {
                curBit *= 2;
                ans[i] = 1 + ans[i - curBit];
            }
        }
        return ans;
    }
}

