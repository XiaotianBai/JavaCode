package com.Algorithm.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public static void main(String[] args)
    {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        int size = nums1.length;
        int[] element = new int[size];
        Arrays.fill(element, -1);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++)
            map.put(nums2[i], i);
        for(int j = 0; j < size; j++)
        {
            if(map.containsKey(nums1[j]))
                for(int k = map.get(nums1[j]);k < nums2.length; k++ )
                {
                    if(nums2[k] > nums1[j]){element[j] = nums2[k]; break;}
                }
        }
        return element;
    }
}