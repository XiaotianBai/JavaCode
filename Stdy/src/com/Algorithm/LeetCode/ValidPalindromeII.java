package com.Algorithm.LeetCode;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int err = -1;
        boolean l = true, r = true;
        int length = s.length();
        if (length <= 2) return true;
        char[] chars = s.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - 1 - i]) {
                err = i;
                System.out.print(err);
                break;
            }
        }
        if (err >= 0) {
            for (int i = err; i < (length / 2); i++) {
                if ((chars[i] != chars[length - 2 - i])) {
                    l = false;
                    break;
                }
            }
            if (l) return true;
            else {
                for (int i = err + 1; i <= (length / 2); i++) {
                    if ((chars[i] != chars[length - i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromeII t = new ValidPalindromeII();
        System.out.print(t.validPalindrome("abc"));
    }
}
