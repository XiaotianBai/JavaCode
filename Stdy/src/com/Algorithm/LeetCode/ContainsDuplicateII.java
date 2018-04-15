package com.Algorithm.LeetCode;

import java.util.HashSet;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2) return false;
        if (k < 1) return false;
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (h.contains(i)) return true;
            h.add(nums[i]);
            if (h.size() > k) h.remove(nums[i - k]);
        }
        return false;
    }
}
