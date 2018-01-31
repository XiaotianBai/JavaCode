package com.Algorithm.LeetCode.Simple;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection (int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int i : nums1) set1.add(i);
        for(int i : nums2) set2.add(i);
        for(int i : set1) if(set2.contains(i)) ans.add(i);
        int[] answer = new int[ans.size()];
        int j = 0;
        while(j < ans.size()){
            for(int i : ans) answer[j++] = i;
        }
        return answer;
        }
}

