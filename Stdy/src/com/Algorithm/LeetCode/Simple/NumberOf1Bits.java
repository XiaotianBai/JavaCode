package com.Algorithm.LeetCode.Simple;

public class NumberOf1Bits {
    public static void main(String[] args){
        System.out.print(hammingWeight(8));
    }

    private static int hammingWeight(int n){
        int ans = 0;
        while(n != 0){
            ans += n & 1;
            n = n >>> 1;
        }
        return ans;
    }

}
