package com.Algorithm.LeetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }

    private static boolean isPalindrome(int x) {
        //we do it by comparing digits from both end
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) div *= 10;
        while (div > 0) {
            int l = x / div;
            int r = x % 10;
            if (l != r) return false;
            x = (x - l * div - r) / 10;
            div = div / 100;
        }
        return true;
    }
}
