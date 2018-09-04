package com.Algorithm.LeetCode;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        int ans = 0;
        int prev = timeSeries[0];
        for (int i = 1; i < timeSeries.length; i++) {
            int cur = timeSeries[i];
            if (cur - prev >= duration) ans += duration;
            else ans += cur - prev;
            prev = cur;
        }
        ans += duration;
        return ans;
    }
}
