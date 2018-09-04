package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (n == 0) return ans;

        String s = "";
        List<String> strings = new ArrayList<>();
        strings.add(s);
        for (int i = 0; i < n; i++) {
            strings = helper(strings);
        }
        HashSet<String> hs = new HashSet<>(strings);
        ans.addAll(hs);
        return ans;
    }

    private List<String> helper(List<String> strings) {
        ArrayList<String> newStrings = new ArrayList<>();
        for (String s : strings) {
            s = "(" + s;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    String newString = s.substring(0, i + 1) + ")" + s.substring(i + 1);
                    newStrings.add(newString);
                }
            }
        }
        return newStrings;
    }
}
