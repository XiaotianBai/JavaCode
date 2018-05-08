package com.Algorithm.LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {};
        System.out.print(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] a = {};
        if (nums1.length == 0 || nums2.length == 0) return a;
        Map<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int min = nums1[0], max = nums1[0];
        for (int i : nums1) {
            int fre = freq.getOrDefault(i, 0);
            freq.put(i, fre + 1);
        }
        for (int i : nums2) {
            if (freq.containsKey(i)) {
                int times = freq.get(i);
                if (times > 0) {
                    ans.add(i);
                    freq.put(i, times - 1);
                }

            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
