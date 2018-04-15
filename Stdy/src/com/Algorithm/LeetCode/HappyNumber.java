package com.Algorithm.LeetCode;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.print(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int i = 10;
        while (i > 0) {
            n = helper(n);
            if (n == 1) return true;
            i--;

        }
        return false;

    }

    public static int helper(int n) {
        int res = 0;
        while (n != 0) {
            int i = n % 10;
            res += i * i;
            n = n / 10;
        }
        return res;
    }
}
