package com.Algorithm.LeetCode;

public class NthDigit {
    public int findNthDigit(int n) {
        if (n < 10) return n;
        long lowerBound = 0;
        long upperBound = 9;
        int d = 1;
        long num = 0;
        int res = 0;
        while (n > upperBound) {
            d++;
            lowerBound = upperBound;
            upperBound = lowerBound + (long)Math.pow(10, d - 1) * 9 * d;
        }
        n -= lowerBound;
        int a = n / d;
        num = (long)Math.pow(10, d - 1) + a;
        System.out.println(num);
        System.out.println(n % d);
        if (n % d == 0) return (int)(num - 1) % 10;
        n -= a * d;
        while (n > 0) {
            res = (int) (num / (long)Math.pow(10, d - 1));
            num -= res * Math.pow(10, d - 1);
            d--;
            n--;
        }
        return res;
    }
    public static void main(String[] args) {
        NthDigit t = new NthDigit();
        System.out.println(t.findNthDigit(1000000000));
    }
}
