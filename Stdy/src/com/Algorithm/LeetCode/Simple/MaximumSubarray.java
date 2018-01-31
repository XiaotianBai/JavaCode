package com.Algorithm.LeetCode.Simple;

import java.util.ArrayList;

public class MaximumSubarray {
    public static void main(String[] args){
        int[] nums = {-1, 0};
        System.out.print(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums){
       boolean positive = false;
       int maxInt = nums[0];
       int curSum = 0;
       int maxSum = nums[0];
       for(int num: nums){
           if(num > 0 && !positive){
               if(maxInt < 0) maxInt = num;
               if(curSum < 0) curSum = 0;
               positive = true;
           }
           if(num > 0){
               curSum += num;
           }
           if(num < 0 && positive){
               positive = false;
               if(curSum > maxSum) maxSum = curSum;

           }
           if((num <= 0)){
               if(maxInt < 0 && num > maxInt) maxInt = num;
               curSum += num;
           }

       }
        if(curSum > maxSum) maxSum = curSum;
        return maxSum < maxInt? maxInt : maxSum;

    }


}
