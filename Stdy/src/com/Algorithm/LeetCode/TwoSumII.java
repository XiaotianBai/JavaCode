package com.Algorithm.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    // A simpler solution is add two numbers from both ends to mid.
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (map.containsKey(current)) {
                ans[0] = map.get(current) + 1;
                ans[1] = i + 1;
                return ans;
            }
            map.put(target - current, i);
        }
        return ans;
    }
}
