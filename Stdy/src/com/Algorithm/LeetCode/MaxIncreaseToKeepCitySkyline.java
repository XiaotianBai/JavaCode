package com.Algorithm.LeetCode;

public class MaxIncreaseToKeepCitySkyline {

    public static void main(String[] args) {

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int ans = 0;
        int[] colMax = new int[grid[0].length];
        int[] rowMax = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            int[] row = grid[i];
            for (int j : row) {
                if (j > max) max = j;
            }
            rowMax[i] = max;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j : grid[i]) {
                if (j > max) max = j;
            }
            colMax[i] = max;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ans += (Math.min(rowMax[i], colMax[j]) - grid[i][j]);
            }
        }
        return ans;

    }
}
