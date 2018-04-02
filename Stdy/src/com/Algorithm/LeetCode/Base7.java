package com.Algorithm.LeetCode;

public class Base7 {
    public static void main(String[] args)
    {
        System.out.println(convertToBase7(-7));
    }

    public static String convertToBase7(int num)
    {
        //alternative: return Integer.toString(num, 7)
        Boolean bool = num < 0;
        if(num == 0) return "0";
        StringBuilder str = new StringBuilder();
        if(num < 0) num = -num;
        while(num != 0) {
            str.append(num % 7);
            num = num / 7;
        }

        if(bool) str.append("-");
        return str.reverse().toString();
    }
}
