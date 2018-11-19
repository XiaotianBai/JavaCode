package com.Algorithm.LeetCode;

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        // Brute force
        // return helper(s1, s2, s3, 0, 0, 0);
        // DP
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i < s1.length(); i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }
        for (int i = 1; i < s2.length(); i++) {
            dp[0][i] = dp[0][i - 1] && s2.charAt(i - 1) == s3.charAt(i - 1);
        }

        for (int i = 1; i < s1.length(); i++) {
            for (int j = 1; j < s2.length(); j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
                        (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                while (j < s1.length()) j++;
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
                        (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
        return dp[s1.length()][s2.length()];

    }

    private boolean helper(String s1, String s2, String s3, int b1, int b2, int b3) {
        if (b3 >= s3.length()) return true;
        if (b1 < s1.length() && s1.charAt(b1) == s3.charAt(b3) && helper(s1, s2, s3, b1 + 1, b2, b3 + 1)) return true;
        else return b2 < s2.length() && s2.charAt(b2) == s3.charAt(b3) && helper(s1, s2, s3, b1, b2 + 1, b3 + 1);

    }
}
