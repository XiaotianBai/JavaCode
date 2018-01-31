package com.Algorithm.LeetCode.Simple;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {0};
        System.out.print(missingNumber(nums));
    }

    public static int missingNumber(int[] nums){
        int[] freq = new int[nums.length + 1];
        for(int i : nums) freq[i]++;
        for(int i = 0; i < nums.length + 1; i++){
            if(freq[i] == 0 && (i == nums.length || freq[i + 1] != 0)) return i;
        }
        return -1;
    }
}
