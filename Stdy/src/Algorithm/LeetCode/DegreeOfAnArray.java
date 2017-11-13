package Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
    public static void main(String[] args)
    {
        int[] nums = {1,2,2,3,1};
        System.out.println(findShortestSubArray(nums));

    }

    public static int findShortestSubArray(int[] nums)
    {
        int size = nums.length;
        int maxDegree = 0;
        int subArrayLength = 50000;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < size; i++)
        {
            if(!map.containsKey(nums[i])) map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for(Map.Entry<Integer, ArrayList<Integer>> e: map.entrySet())
        {
            ArrayList<Integer> arr = e.getValue();
            int j = arr.size();
            int k = 0;
            if(j > maxDegree)
            {
                maxDegree = j;
                System.out.println(arr);
                k = arr.get(j - 1) - arr.get(0) + 1;
                subArrayLength = k;
            }
            if(j == maxDegree)
            {
                maxDegree = j;
                k = arr.get(j - 1) - arr.get(0) + 1;
                if(k < subArrayLength) subArrayLength = k;
            }
        }
        return subArrayLength;
    }
}
