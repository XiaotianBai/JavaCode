package com.Algorithm.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7};
        int target = 4;
        int[] answer1 = bruteForce(array, target);
        int[] answer2 = betterSolution(array, target);
        System.out.print(Arrays.toString(answer1));
        System.out.print(Arrays.toString(answer2));
    }


    public static int[] bruteForce(int[] nums, int target) {
        int[] solution = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                }

            }
        }

        return solution;
    }

    public static int[] betterSolution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] solution = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) > i) {
                solution[0] = i;
                solution[1] = map.get(target - nums[i]);
            }
        }
        return solution;
    }
}
