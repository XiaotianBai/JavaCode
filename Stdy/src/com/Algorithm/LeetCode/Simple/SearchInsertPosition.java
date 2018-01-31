package com.Algorithm.LeetCode.Simple;

public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        System.out.print(searchInsert(nums, 5));
    }

    private static int searchInsert(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target) return i;
        }
        return nums.length;
    }
}
