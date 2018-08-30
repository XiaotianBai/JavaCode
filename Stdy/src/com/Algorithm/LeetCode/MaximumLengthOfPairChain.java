package com.Algorithm.LeetCode;

public class MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        boolean found = true;
        int min = pairs[0][1];
        int ans = 0;
        for (int[] pair : pairs) {
            if (pair[1] < min) min = pair[1];
        }
        int cur = min;
        while (found) {
            ans++;
            found = false;
            for (int[] pair : pairs) {
                if (pair[0] > cur) {
                    if (!found) {
                        min = pair[1];
                    }
                    else if (pair[1] < min) {
                        min = pair[1];
                    }
                    found = true;
                }
            }
            cur = min;
        }
        return ans;
    }

}
