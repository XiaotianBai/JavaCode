package com.Algorithm.LeetCode;

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0) return 0;
        int res = 0;
        for (int i = 0; i < 31; i ++) {
            if ((n & 1) == 1) res++;
            n = n >> 1;
            res = res << 1;
        }
        if ((n & 1) == 1) res++;
        return res;
    }

    public static void main(String[] args) {
        ReverseBits t = new ReverseBits();
        System.out.print(t.reverseBits(43261596));
    }
}
