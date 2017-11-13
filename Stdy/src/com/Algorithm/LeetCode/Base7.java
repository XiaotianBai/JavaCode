package com.Algorithm.LeetCode;

public class Base7 {
    public static void main(String[] args)
    {
        System.out.println(convertToBase7(-1));
    }

    public static String convertToBase7(int num)
    {
        //alternative: return Integer.toString(num, 7)
        if(num == 0) return "0";
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        if(num < 0) {ans.append("-"); num = -num;}
        while(num > 0) {
            str.append(num % 7);
            num = num / 7;
        }
        return ans.append(str.reverse()).toString();
    }
}
