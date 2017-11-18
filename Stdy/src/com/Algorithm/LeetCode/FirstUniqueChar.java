package com.Algorithm.LeetCode;

public class FirstUniqueChar {
    public static void main(String[] args){
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s){
        char[] chars = s.toCharArray();
        int[] freq = new int[26];
        for(char c : chars) freq[c - 'a'] += 1;
        for(int i = 0; i < chars.length; i++)
            if(freq[chars[i] - 'a'] == 1) return i;
        return -1;
    }
}
