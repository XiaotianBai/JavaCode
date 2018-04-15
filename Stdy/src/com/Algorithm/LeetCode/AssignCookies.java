package com.Algorithm.LeetCode;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {

    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; j++) {
            if (g[i] <= s[j]) {
                ans++;
                i++;
            }
        }
        return ans;
    }
}
