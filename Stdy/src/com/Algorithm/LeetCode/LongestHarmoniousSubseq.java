package com.Algorithm.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubseq {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 5, 6};
        System.out.print(findLHS(nums));
    }

    public static int findLHS(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int sum = map.get(key) + map.get(key + 1);
                if (sum > max) max = sum;
            }
        }
        return max;
    }
}
