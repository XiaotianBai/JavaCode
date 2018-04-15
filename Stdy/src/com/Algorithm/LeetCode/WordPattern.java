package com.Algorithm.LeetCode;

import java.util.HashSet;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] sa = str.split(" ");
        char[] ca = pattern.toCharArray();
        if (sa.length != ca.length) return false;
        if (sa.length == 0) return true;
        String[] pairs = new String[128];
        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < ca.length; i++) {
            if (pairs[ca[i]] == null) {
                if (strings.contains(sa[i])) return false;
                strings.add(sa[i]);
                pairs[ca[i]] = sa[i];
            } else if (!pairs[ca[i]].equals(sa[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern test = new WordPattern();
        System.out.print(test.wordPattern("aabb", "cat cat cat cat"));
    }
}
