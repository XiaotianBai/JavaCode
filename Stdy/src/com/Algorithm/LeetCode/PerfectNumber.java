package com.Algorithm.LeetCode;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0) return false;
        int sum = 0;
        double sqrt = Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) sum += (i + num / i);
        }
        sum -= num;
        if (sqrt == (int) sqrt) sum -= sqrt;
        return (sum == num);
    }
}
