package com.Algorithm.LeetCode;

public class HouseRobber {
    public static void main(String[] args){
        int[] nums = {1,1};
        System.out.print(rob(nums));
    }

    private static int rob(int[] nums){
        int rob = 0, notRob = 0, temp;
        for (int num : nums) {
            temp = notRob;
            notRob = Math.max(rob, notRob);
            rob = temp + num;
        }
        return Math.max(rob, notRob);
    }
}
