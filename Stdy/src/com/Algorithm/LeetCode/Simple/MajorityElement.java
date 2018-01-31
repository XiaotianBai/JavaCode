package com.Algorithm.LeetCode.Simple;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args){
        int[] nums = {1,3,3,4,4,4,4,4,5,6,4};
        System.out.println(majorityElement(nums));
        System.out.println(solutionTwo(nums));
    }

    public static int majorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
            if(map.get(nums[i]) > nums.length / 2) return nums[i];
        }
        return 0;
    }

    public static int solutionTwo(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            if(!set.contains(current)){
                int time = 0;
                for(int j : nums) if(j == current) time++;
                if(time > nums.length / 2) return current;
                set.add(i);
            }

        }
        return 0;
    }

}
