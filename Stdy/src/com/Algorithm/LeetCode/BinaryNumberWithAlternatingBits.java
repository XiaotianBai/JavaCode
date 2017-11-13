package com.Algorithm.LeetCode;

public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args)
    {
        int n = 4;
        System.out.println(hasAlternatebits(n));
    }

    public static boolean hasAlternatebits(int n)
    {
        int rightShift = n >> 1;
        int temp = n^rightShift;
        return(((temp+1) & temp) == 0);
    }
}
