package com.Algorithm.LeetCode;
import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args)
    {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    //use the sign of nums[i - 1] to indicate if i occurs.
    public static List<Integer> findDisappearedNumbers(int[] nums)
    {
        List<Integer> ans = new ArrayList<>();
        for(int i : nums){int num = nums[Math.abs(i) - 1]; if(num > 0)nums[Math.abs(i) - 1] = -num;}
        for(int i = 1; i < nums.length + 1; i++)
        {
            if(nums[i - 1] > 0) ans.add(i);
        }
        return ans;
    }
}
