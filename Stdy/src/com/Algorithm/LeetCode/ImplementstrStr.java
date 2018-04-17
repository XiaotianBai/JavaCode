package com.Algorithm.LeetCode;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        int res = 0;
        boolean b = true;
        if (needle.equals("")) return 0;
        int hl = haystack.length();
        int nl = needle.length();
        if (nl ==hl) return needle.equals(haystack)? 0 : -1;
        if (nl > hl) return -1;
        char[] hc = haystack.toCharArray();
        char[] nc = needle.toCharArray();
        for (int i = 0; i < hl - nl + 1; i++) {
            if (hc[i] == nc[0]) {
                b = true;
                for (int j = 1; j < nl; j++) {
                    if (hc[i + j] != nc[j]) {
                        b = false;
                        break;
                    }
                }
                if(b) return i;
            }
        }
        return -1;
    }
}
