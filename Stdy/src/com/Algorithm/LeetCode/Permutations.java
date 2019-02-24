package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        res.add(arr);
        boolean[] usage = new boolean[nums.length];
        Arrays.fill(usage, false);
        helper(arr, nums, 0);
        return res;
    }

    private void helper(List<Integer>list, int[] nums, int index) {
        for (int i = index + 1; i < nums.length; i++) {
            List<Integer> newArr = new ArrayList<>(list);
            newArr.add(nums[i]);
            res.add(newArr);
            swap(nums, i, index);
            helper(newArr, nums, index + 1);
            swap(nums, index, i);
        }
        list.add(nums[index]);
        if (index < nums.length - 1) helper(list, nums, index + 1);

    }

    private void swap(int[] nums, int pos, int index) {
        int temp = nums[pos];
        nums[pos] = nums[index];
        nums[index] = temp;
    }
}
