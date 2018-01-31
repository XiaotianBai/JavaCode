package com.Algorithm.LeetCode.Simple;

public class ValidAnagram {
    public static void main(String[] args){
        System.out.print(isAnagram("abcdf","fcbad"));
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int[] ans = new int[26];
        for(char c : a) ans[c - 'a'] += 1;
        for(char c : b) ans[c - 'a'] -= 1;
        for(int i : ans) if(i != 0) return false;
        return true;
    }
}
