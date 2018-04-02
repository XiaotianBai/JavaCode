package com.Algorithm.LeetCode;

public class ArrayPartitionI {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4};
        System.out.print(partition(nums));
    }
    public static int partition(int[] nums)
    {
        int i =1;
        int sum = 0;
        while(i < nums.length)
        {
            int j = i - 1;
            int key = nums[i];
            while(j >= 0 && nums[j] > key)
            {
                nums[j+1] = nums[j];
                nums[j] = key;

                //  key = al.get(i);
                j = j - 1;
            }
            i = i + 1;
        }
        for(int ii = 0; ii < nums.length; ii += 2)
        {
            sum += nums[ii];
        }
        return sum;
    }
}
