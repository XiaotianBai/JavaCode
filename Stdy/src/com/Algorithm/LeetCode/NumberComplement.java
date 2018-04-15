package com.Algorithm.LeetCode;

import java.util.Arrays;

public class NumberComplement {
    public static void main(String[] args) {
        System.out.print(findComplement(9));
    }

    public static int findComplement(int num) {
        int complement = 0;
        int[] binary = new int[32];
        int[] newbinary = new int[32];
        for (int i = 0; i < 32; i++) {
            if (num <= 0) {
                newbinary = Arrays.copyOf(binary, i);
                break;
            } else if ((num % 2) == 1)
                binary[i] = 1;
            else binary[i] = 0;
            num = num / 2;
        }

        for (int i = 0; i < newbinary.length; i++) {
            if (newbinary[i] == 0) newbinary[i] = 1;
            else newbinary[i] = 0;
            complement += newbinary[i] * Math.pow(2, i);
        }
        return complement;
    }

}
