package com.Algorithm.LeetCode;

public class ReachANumber {
    public int reachNumber(int target) {
        if (target == 0) return 0;
        int abs = Math.abs(target);
        if (abs == 1) return 1;
        int cur = 1;
        int ans = 0;
        while (abs > cur || (((abs - cur) % 2) != 0)) {
            ans++;
            cur += ans;
        }
        return ans;
    }
}
