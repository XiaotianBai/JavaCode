package com.Algorithm.LeetCode;

import java.util.Arrays;

public class ConstructTheRectangle {
    public static void main(String[] args) {
        int area = 9;
        System.out.println(Arrays.toString(constructRectangle(area)));
    }

    public static int[] constructRectangle(int area) {
        int[] ans = new int[2];
        for (int i = (int) Math.sqrt(area); i > 0; i--) {
            if (area % i == 0) {
                ans[0] = area / i;
                ans[1] = i;
                return ans;
            }
        }
        return ans;
    }
}
