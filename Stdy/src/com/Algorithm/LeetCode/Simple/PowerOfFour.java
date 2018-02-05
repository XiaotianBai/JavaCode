package com.Algorithm.LeetCode.Simple;

public class PowerOfFour {
    public static void main(String[] args){
        System.out.print(isPowerOfFour(1));
    }

    private static boolean isPowerOfFour(int num){
        if(num <= 0) return false;
        while((num & 3) == 0){
            num >>>= 2;
        }
        return num == 1;
    }
}
