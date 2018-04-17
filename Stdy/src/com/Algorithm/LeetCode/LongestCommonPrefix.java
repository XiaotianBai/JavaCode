package com.Algorithm.LeetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        int leng = strs[0].length();
        for(String s : strs)
            if (s.length() < leng)
                leng = s.length();
        int pos = 0;
        while(pos < leng){
            char c = strs[0].charAt(pos);
            for(String s : strs){
                if (s.charAt(pos) != c) {
                    return strs[0].substring(0, pos);
                }
            }
            pos++;
        }
        return strs[0].substring(0, pos);
    }

    public static void main(String[] args) {
        LongestCommonPrefix t = new LongestCommonPrefix();
        String[] strs = {"abcd", "ab", "abcd"};
        System.out.println(t.longestCommonPrefix(strs));
    }
}
