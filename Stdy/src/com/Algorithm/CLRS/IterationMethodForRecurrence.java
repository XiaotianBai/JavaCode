package com.Algorithm.CLRS;

public class IterationMethodForRecurrence {
    public static void main(String[] args) {
        System.out.println(recurrence(10000));
    }

    private static double recurrence(double n) {
        double res = 0;
        if (n <= 1) return 1;
        else res += (2 * recurrence(n / 3) + Math.sqrt(n) * Math.log(n));
        return res;
    }
}
