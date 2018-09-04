package com.Algorithm.LeetCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSum {
    private  Map<String, Integer> map;
    /** Initialize your data structure here. */
    public MapSum() {
      map = new HashMap<String, Integer>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        Set<String> keys = map.keySet();
        for (String key : keys) {
            int i = 0;
            boolean pre = true;
            if (prefix.length() > key.length()) continue;
            while (i < prefix.length()) {
                if (prefix.charAt(i) != key.charAt(i)) {
                    pre = false;
                    break;
                }
                i++;
            }
            if (pre) sum += map.get(key);
        }
        return sum;
    }
}