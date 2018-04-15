package com.Algorithm.LeetCode;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }

    public static int titleToNumber(String s) {
        int num = 0;
        int index = s.length() - 1;
        int pow = 0;
        while (index >= 0) {
            num += (((int) s.charAt(index) - 64) * Math.pow(26, pow));
            index--;
            pow++;
        }
        return num;
    }
}
