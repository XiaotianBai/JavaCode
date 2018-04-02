package com.Algorithm.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args)
    {}

    public static int singleNumber(int[] nums)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            if(!map.containsKey(i))
            map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }
        for(int i : nums)
        {
            if(map.get(i) != 2) return i;
        }
        return -1;
    }

}
