package com.Algorithm.LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] nums = {1,1,1,1,2,2,2,2,3,3,4,4,4,4};
        int[] nums2 = {1,1,1,1};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int curPos = 0;
        int prev = nums[0];
        for(int j = 1; j < nums.length; j++){
            if(nums[j] == prev) continue;
            else{
                nums[curPos] = prev;
                curPos ++;
                prev = nums[j];
            }
        }
        nums[curPos] = prev;
        curPos ++;
        return curPos;
    }
}
