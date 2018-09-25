package com.Algorithm.LeetCode;

import java.util.Arrays;

public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        if (obstacleGrid[0][0] == 0) dp[0][0] = 1;
        else return 0;
        if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) return 0;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (i == 0 && j == 0) continue;
                dp[i][j] = 0;
                if (i != 0 && obstacleGrid[i - 1][j] == 0) dp[i][j] += dp[i - 1][j];
                if (j != 0 && obstacleGrid[i][j - 1] == 0) dp[i][j] += dp[i][j - 1];
            }
        }
        System.out.println(Arrays.toString(dp[0]));
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
