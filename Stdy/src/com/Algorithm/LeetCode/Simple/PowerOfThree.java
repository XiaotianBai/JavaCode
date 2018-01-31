package com.Algorithm.LeetCode.Simple;

public class PowerOfThree {
    public static void main(String[] args){
        System.out.print(isPowerOfThree(44));
    }

    private static boolean isPowerOfThree(int n){
        if(n <= 0) return false;
        String s = Integer.toString(n, 3);
        try{
            int i = Integer.valueOf(s, 2);
            return ((i & (i - 1)) == 0);
        }
        catch (Exception e){
            return false;
        }
    }


}
