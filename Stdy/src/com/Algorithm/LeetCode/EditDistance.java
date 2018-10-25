package com.Algorithm.LeetCode;

import java.util.Arrays;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        int[][] positions = findLCS(word1, word2);
        int i = 0;
        int ans = 0;
        while (positions[0][i] != -1) {
            if (i == 0) {
                ans += positions[1][i];
                if (positions[0][i] > positions[1][i]) {
                    ans += positions[0][i] - positions[1][i];
                }
            } else {
                ans += positions[1][i] - positions[1][i - 1];
                if (positions[0][i] - positions[0][i - 1] > positions[1][i] - positions[1][i - 1]) {
                    ans += (positions[0][i] - positions[0][i - 1] - positions[1][i] + positions[1][i - 1]);
                }
            }
            i++;
        }
        return ans;
    }

    private int[][] findLCS(String word1, String word2) {

        int[][] positions = new int[2][];
        positions[0] = new int[word1.length()];
        positions[1] = new int[word2.length()];
        Arrays.fill(positions[0], -1);
        Arrays.fill(positions[1], -1);
        int l1 = word1.length();
        int l2 = word2.length();
        if (l1 == 0 || l2 == 0) return positions;
        // int[][] dp = new int[l1 + 1][l2 + 1];
//        for (int i = 0; i < l1 + 1; i++) {
//            dp[i][0] = 0;
//        }
//        for (int i = 0; i < l2 + 1; i++) {
//            dp[0][i] = 0;
//        }
        int pos = 0;
        for (int i = 1; i < l1 + 1; i++) {
            char c = word1.charAt(i - 1);
            for (int j = 1; j < l2 + 1; j++) {
                if (word2.charAt(j - 1) == c) {
                    //dp[i][j] = dp[i - 1][j - 1] + 1;
                    positions[0][pos] = i - 1;
                    positions[1][pos] = j - 1;
                    pos++;
                }
                //else dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }


        //System.out.print(Arrays.toString(dp[l1]));
        return positions;
    }


}
