package com.Algorithm.LeetCode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.print(isPerfectSquare(2));
    }

    private static boolean isPerfectSquare(int num) {
        int ratio = 16;
        int coefficient = 1;
        int upper = -1;
        int lower = 0;
        if (num == 0) return true;
        while (upper == -1) {

            if ((double) num / coefficient == coefficient) return true;
            else if ((double) num / coefficient > coefficient) {
                if (lower < coefficient) lower = coefficient;
                coefficient *= ratio;
            } else if ((double) num / coefficient < coefficient) {
                upper = coefficient;
            }
        }

        while (upper > lower + 1) {
            coefficient = (lower + upper) / 2;
            if ((double) num / coefficient == coefficient) return true;
            else if ((double) num / coefficient > coefficient) {
                lower = coefficient;
            } else if ((double) num / coefficient < coefficient) {
                upper = coefficient;
            }

        }
        System.out.println(lower);
        System.out.println(upper);
        return false;
    }
}
