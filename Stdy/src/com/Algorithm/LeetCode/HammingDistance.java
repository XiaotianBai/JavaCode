package com.Algorithm.LeetCode;

import java.util.Arrays;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.print(Solution(680142203, 1111953568));
    }

    public static int Solution(int x, int y) {
        int[] ax = new int[32];
        int[] ay = new int[32];
        int distance = 0;
        for (int i = 0; i < 31; i++) {
            if ((x % 2) == 1) ax[30 - i] = 1;
            else ax[30 - i] = 0;
            x = x / 2;
            if ((y % 2) == 1) ay[30 - i] = 1;
            else ay[30 - i] = 0;
            y = y / 2;
            if (ax[30 - i] != ay[30 - i]) distance += 1;
        }

        System.out.println(Arrays.toString(ax));
        System.out.println(Arrays.toString(ay));
        return distance;
    }
}
