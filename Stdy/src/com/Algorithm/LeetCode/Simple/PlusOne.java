package com.Algorithm.LeetCode.Simple;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args){
        int[] digits = {9, 9, 9};
        System.out.print(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits){
        int length = digits.length;
        boolean carryFlag = false;
        if(digits[length - 1] == 9){
            digits[length - 1] = 0;
            carryFlag = true;
        }
        else digits[length - 1] += 1;
        if(carryFlag){
            for(int i = length - 2; i >= 0; i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                }
                else{
                    digits[i] += 1;
                    carryFlag = false;
                    break;
                }
            }
        }
        if(carryFlag){
            int[] ans = new int[length + 1];
            ans[0] = 1;
            for(int i = 1; i < ans.length; i++){
                ans[i] = digits[i - 1];
            }
            return ans;
        }
        else return digits;

    }
}
