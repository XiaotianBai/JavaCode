package com.Algorithm.LeetCode;

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {

    }

    private static int countSegments(String s) {
        int res = 0;
        boolean spaced = true;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                if (!spaced) spaced = true;
            }
            if (c != ' ' && spaced) {
                spaced = false;
                res++;
            }

        }
        return res;
    }
}
