package com.Algorithm.LeetCode;

public class SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;
        if (c == 0) return true;
        double d = Math.sqrt(c);
        if (d == (int) d) return true;
        for (int i = 1; i < Math.sqrt(c); i++) {
            double dd = Math.sqrt(c - i * i);
            if (dd == (int) dd) return true;
        }
        return false;
    }
}
