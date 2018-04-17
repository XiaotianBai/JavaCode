package com.Algorithm.LeetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void main() {
        String[] strs = {"abcd", "abcd", "abcd"};
        LongestCommonPrefix t = new LongestCommonPrefix();
        t.longestCommonPrefix(strs);
    }
}