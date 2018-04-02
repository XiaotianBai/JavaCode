package com.Algorithm.LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args){

    }

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){if(set.contains(i)) return true; else set.add(i);}
        return false;
    }

    public static boolean secondSolution(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)set.add(i);
        if(set.size() == nums.length)return false;
        else return true;
    }
}
