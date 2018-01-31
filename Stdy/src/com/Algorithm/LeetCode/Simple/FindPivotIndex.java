package com.Algorithm.LeetCode.Simple;

public class FindPivotIndex {
    public static void main(String[] args){
        int[] nums = {1,0};
        System.out.print(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums){
        int sum = 0, rightSum, index = 0;
        int leng = nums.length;
        if(leng == 0) return -1;
        if(leng == 1) return nums[0];
        for(int i : nums) sum += i;
        rightSum = sum;
        while(index < leng){
            int j = nums[index];
            rightSum -= j;
            if(sum - j == 2 * rightSum) return index;
            index ++;
        }
        return -1;

    }

    public static int solutionTwo(int[] nums){
        int leng = nums.length, left = 0;
        int[] leftSum = new int[leng];
        for(int i = 0; i < leng; i ++){
            left += nums[i];
            leftSum[i] = left;
        }
        for(int i = 0; i < leng; i ++){
            if(2 * leftSum[i] == left + nums[i]) return i;
        }
        return -1;
    }
}
