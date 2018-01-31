package com.Algorithm.LeetCode.Simple;

public class LongestContIncSubsequence {
    public static void main(String[] args){
        int[] nums = {1,3,5,7};
        System.out.print(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums){
        int leng = 1, ans = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]) leng++;
            else {
                if(leng > ans) ans = leng;
                leng = 0;
            }
        }
        if(ans == 0) ans = leng;
        return ans;
    }
}
