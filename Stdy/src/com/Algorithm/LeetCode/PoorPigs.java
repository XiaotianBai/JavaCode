package com.Algorithm.LeetCode;

public class PoorPigs {
    public static void main(String[] args) {
        System.out.print(poorPigs(1000, 15, 60));
    }

    private static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int timeSlots = minutesToTest / minutesToDie;
        return (int) Math.ceil(Math.log(buckets) / Math.log(timeSlots + 1));
    }
}
