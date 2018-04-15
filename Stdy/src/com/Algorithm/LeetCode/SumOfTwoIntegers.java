package com.Algorithm.LeetCode;

public class SumOfTwoIntegers {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        System.out.println(getSum(a, b));
    }

    public static int getSum(int a, int b) {
        if ((a & b) == 0) return (a ^ b);
        else return getSum((a ^ b), (a & b) << 1);
    }
}
