package com.Algorithm.LeetCode;

public class ReverseStringII {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdef", 3));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int size = chars.length;
        char temp;
        for (int i = 0; i < size; i += 2 * k) {
            for (int m = i, n = Math.min(i + k - 1, size - 1); m < n; m++, n--) {
                temp = chars[m];
                chars[m] = chars[n];
                chars[n] = temp;
            }
        }
        return String.valueOf(chars);
    }
}
