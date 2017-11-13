package Algorithm.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindTheDifference {
    public static void main(String[] args)
    {
        String s = "a";
        String t = "aa";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t)
    {
        Map<Character, Integer> map = new HashMap<>();
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        for(char c : ct){if(!map.containsKey(c))map.put(c, 1); else map.put(c, map.get(c) + 1);}
        for(char c : cs)map.put(c, map.get(c) + 1);
        for(char c : ct)if(map.get(c) % 2 != 0) return c;
        return '0';
    }
}
