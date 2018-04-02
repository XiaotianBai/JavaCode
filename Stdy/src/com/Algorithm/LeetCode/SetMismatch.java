package com.Algorithm.LeetCode;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args){
        int[] nums = {1,2,2,4};
        System.out.print(Arrays.toString(findErrorNums(nums)));
    }

    private static int[] findErrorNums(int[] nums){
        int[] ans = new int[2];
        int[] freqs = new int[nums.length];
        for(int num : nums) freqs[num - 1] ++;
        for(int i = 0; i < freqs.length; i++) {
            if(freqs[i] == 2) ans[0] = i + 1;
            if(freqs[i] == 0) ans[1] = i + 1;
        }
        return ans;
    }
}
