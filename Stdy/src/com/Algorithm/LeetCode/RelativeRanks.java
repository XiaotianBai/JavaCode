package com.Algorithm.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Arrays.sort(nums);
        System.out.print(Arrays.toString(findRelativeRanks(nums)));
    }

    public static String[] findRelativeRanks(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        String[] ans = new String[nums.length];
        for (int i = 0; i < length; i++) {
            int index = map.get(nums[i]);
            int rank = length - i;
            if (rank == 1) ans[index] = "Gold Medal";
            else if (rank == 2) ans[index] = "Silver Medal";
            else if (rank == 3) ans[index] = "Bronze Medal";
            else ans[map.get(nums[i])] = "" + rank;
        }
        return ans;

    }
}
