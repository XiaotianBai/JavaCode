package com.Algorithm.LeetCode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args)
    {
        int[] nums = {1,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums)
    {
        if(nums.length == 1) return;
        int zeroes = 0;
        for(int i = 0; i < nums.length; i ++)
        {
            if(nums[i] == 0) zeroes++;
            else if(zeroes > 0){nums[i - zeroes] = nums[i]; nums[i] = 0;}
        }
    }
}
