package com.Algorithm.LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        int[] nums = {1,2,2,3,4,5,4,4,4};
        System.out.println(removeElement(nums, 4));
        System.out.print(Arrays.toString(nums));
    }

    private static int removeElement(int[] nums, int val){
        int ans = nums.length;
        for(int i = 0; i < ans; i++){
            if(nums[i] == val) {
                ans--;
                if(i == nums.length - 1) break;
                else for(int j = i; j < ans; j ++)
                    nums[j] = nums[j + 1];
                i--;
            }
        }

        return ans;
    }

}
