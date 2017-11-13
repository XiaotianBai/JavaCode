package com.Algorithm.LeetCode;

public class ExcelSheetTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(27));
    }

    public static String convertToTitle(int n)
    {
        StringBuilder str = new StringBuilder();
        while(n != 0)
        {
            str.append(String.valueOf((char)((n - 1) % 26 + 65)));
            n = (n - 1) / 26;
        }
        return str.reverse().toString();

    }
}
