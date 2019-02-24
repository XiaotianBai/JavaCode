package com.Algorithm.LeetCode;

import java.util.Arrays;

public class FriendCircles {
    private boolean[] used;
    private int res = 0;
    public int findCircleNum(int[][] M) {
        used = new boolean[M.length];
        for (int i = 0; i < M.length; i++) {
            DFS (i, M);
        }
        return res;
    }
    private void DFS(int index, int[][] M) {
        if(!used[index]) res++;
        used[index] = true;
        for (int i = 0; i < M.length; i++) {
            if (M[index][i] == 1 && !used[i]) {
                used[i] = true;
                DFS(i, M);
            }
        }
    }
}
