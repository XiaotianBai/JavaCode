package com.Algorithm.LeetCode.Simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinimumIndexSum {
    public static void main(String[] args){
        String[] list1 = {"aa", "bb", "cc"};
        String[] list2 = {"bb", "aa", "dd"};
        System.out.print(Arrays.toString(findRestaurants(list1,list2)));

    }

    public static String[] findRestaurants(String[] list1, String[] list2){
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        int min = Integer.MAX_VALUE, count = 0;
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                int temp = i + map.get(list2[i]);
                if(temp < min){
                    min = temp;
                    count = 1;
                    set.clear();
                    set.add(list2[i]);
                }
                else if (temp == min){
                    count ++;
                    set.add(list2[i]);
                }
            }
        }
        String[] tempAns = new String[set.size()];

        return set.toArray(tempAns);
    }
}
