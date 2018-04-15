package com.Algorithm.LeetCode;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }

    private static int arrangeCoins(int n) {
        double guess = (int) (Math.sqrt(n) * Math.sqrt(2));
        while (guess / 2 * (guess + 1) > n) {
            guess--;
        }
        return (int) guess;
    }
}
