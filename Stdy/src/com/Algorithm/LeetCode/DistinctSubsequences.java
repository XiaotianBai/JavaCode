package com.Algorithm.LeetCode;

public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        if (s.length() < t.length()) return 0;
        if (s.length() == t.length()) return s.equals(t) ? 1 : 0;
        int dp[][] = new int[s.length()][t.length()];
        dp[0][0] = s.charAt(0) == t.charAt(0) ? 1 : 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(0)) {
                dp[i][0] = dp[i - 1][0] + 1;
            } else dp[i][0] = dp[i - 1][0];
        }
        int j = 1;
        while (j < t.length()) {
            int prev = 0;
            for (int i = j; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + prev;
                    prev += dp[i - 1][j - 1];
                } else dp[i][j] = dp[i - 1][j];
            }
            j++;
        }
        return dp[s.length() - 1][t.length() - 1];
    }
}
