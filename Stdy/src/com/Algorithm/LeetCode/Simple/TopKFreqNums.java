package com.Algorithm.LeetCode.Simple;


import java.util.*;

public class TopKFreqNums {
    public static void main(String[] args){
        int[] nums = {1};
        System.out.print(topKFrequent(nums,1));
        System.out.print(solutionTwo(nums,1));
    }

    public static List<Integer> topKFrequent(int[] nums, int k){
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, LinkedList<Integer>> inverseFreq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for(Integer i : freq.keySet()){
            LinkedList<Integer> list = inverseFreq.getOrDefault(freq.get(i), new LinkedList<>());
            list.add(i);
            inverseFreq.put(freq.get(i), list);
        }
        List<Integer> values = new ArrayList<>(freq.values());
        Collections.sort(values);
        Collections.reverse(values);
        int i = 0;
        while(i < k){
            ans.add(inverseFreq.get(values.get(i)).remove());
            i++;
        }
        return ans;
    }

    public static List<Integer> solutionTwo(int[] nums, int k){
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int i = 1, fre = 1, prev = nums[0], cur = 0;
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        List<Integer> fres = new ArrayList<>();
        while(i < nums.length){
            cur = nums[i];
            if(cur != prev){
                LinkedList<Integer> list = map.getOrDefault(fre, new LinkedList<>());
                list.add(prev);
                map.put(fre, list);
                fres.add(fre);
                fre = 1;
            }
            else fre++;
            prev = cur;
            i++;
        }
        LinkedList<Integer> list = map.getOrDefault(fre, new LinkedList<>());
        list.add(prev);
        map.put(fre, list);
        fres.add(fre);

        Collections.sort(fres);
        Collections.reverse(fres);
        i = 0;
        while(i < k){
            ans.add(map.get(fres.get(i)).remove());
            i++;
        }
        return ans;

    }
}
