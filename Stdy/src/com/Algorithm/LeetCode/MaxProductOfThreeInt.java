package com.Algorithm.LeetCode;

import java.util.Arrays;

public class MaxProductOfThreeInt {
    public static void main(String[] args){
        int[] nums = {-3, -5, -1, 0, 1, 3, 4};
        System.out.print(maximumProduct(nums));
    }


    public static int maximumProduct(int[] nums){
        int leng = nums.length;
        if(leng == 3) return nums[0] * nums[1] * nums[2];
        Arrays.sort(nums);
        if(nums[1] >=0) return nums[leng - 1] * nums[leng -2] * nums[leng -3];
        else if(nums[0] * nums[1] > nums[leng - 2] * nums[leng - 3]) return nums[0] * nums[1] * nums [leng - 1];
        else return nums[leng - 1] * nums[leng -2] * nums[leng -3];
    }

    public static int solutionWithoutSort(int[] nums){
        int min = 0, secMin = 0, max = 0, secMax = 0, thirdMax = 0;
        int leng = nums.length;
        if(leng == 3) return nums[0] * nums[1] * nums[2];
        for(int i : nums){
            if(i < min){
                secMin = min;
                min = i;
            }
            else if(i < secMin ) secMin = i;
            if(i > max){
                thirdMax = secMax;
                secMax = max;
                max = i;
            }
            else if(i > secMax){
                thirdMax = secMax;
                secMax = i;
            }
            else if(i > thirdMax) thirdMax = i;
        }
        if(secMin >= 0) return max * secMax * thirdMax;
        else if(min * secMin > secMax * thirdMax) return min * secMin * max;
        else return thirdMax * secMax * max;

    }
}
