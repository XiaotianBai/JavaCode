package com.Algorithm.LeetCode;

public class PowerOfTwo {
    public static void main(String[] args) {
        int i = -2147483648;
        i = i - 1;
        System.out.print(isPowerOfTwo(16));
        System.out.print(i);
    }

    private static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
