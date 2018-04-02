package com.Algorithm.LeetCode;

public class ConvertNumToHex {
    public static void main(String[] args){
        System.out.println(toHex(-2));
    }

    public static String toHex(int num){
        char[] digits = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num == -2147483648) return "80000000";
        if(num == 0) return "0";
        boolean bool = num < 0;
        StringBuilder str = new StringBuilder();
        if(num < 0) num = -(-2147483648 - num);
        while(num > 7){
            str.insert(0, digits[num % 16]);
            num = num / 16;
        }
        if(num != 0){
            if(bool)str.insert(0, digits[num + 8]);
            else str.insert(0, digits[num]);
        }

        return str.toString();
    }
}
