package com.Algorithm.Util;

import java.util.Random;

public class RandomIntegerArray {
    public static Integer[] generateArray(int length, int lowerBound, int upperBound) {
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            Random random = new Random();
            array[i] = lowerBound + random.nextInt((upperBound - lowerBound + 1));
        }
        return array;
    }
}
