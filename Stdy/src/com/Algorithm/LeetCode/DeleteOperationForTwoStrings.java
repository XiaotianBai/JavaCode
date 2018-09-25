package com.Algorithm.LeetCode;

import java.util.Arrays;

public class DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        int common = findLongestCommonString(word1, word2);
        return (word1.length() + word2.length() - 2 * common);
    }

    private int findLongestCommonString(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        if (l1 == 0 || l2 == 0) return 0;
        int[][] dp = new int[l1 + 1][l2 + 1];
//        for (int i = 0; i < l1 + 1; i++) {
//            dp[i][0] = 0;
//        }
//        for (int i = 0; i < l2 + 1; i++) {
//            dp[0][i] = 0;
//        }
        for (int i = 1; i < l1 + 1; i++) {
            char c = word1.charAt(i - 1);
            for (int j = 1; j < l2 + 1; j++) {
                if (word2.charAt(j - 1) == c) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        System.out.print(Arrays.toString(dp[l1]));
        return dp[l1][l2];
    }
}
