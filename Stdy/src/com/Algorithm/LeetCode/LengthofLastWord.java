package com.Algorithm.LeetCode;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) return 0;
        return words[words.length - 1].length();
    }

    public int betterSolution(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
}
