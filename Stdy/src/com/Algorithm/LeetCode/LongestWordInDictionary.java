package com.Algorithm.LeetCode;

import java.util.ArrayList;

public class LongestWordInDictionary {
    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String word = "apple";
        System.out.println(longestWord(words));
        System.out.println(word.substring(0, 4));

    }

    private static String longestWord(String[] words) {
        String res = "";
        ArrayList<ArrayList<String>> strings = new ArrayList<>();
        for (int i = 0; i <= 30; i++) strings.add(new ArrayList<>());
        int maxLength = 0;
        boolean flag = true;
        for (String s : words) {
            strings.get(s.length()).add(s);
        }
        for (String s : words) {
            if (s.length() < maxLength || (s.length() == maxLength && s.compareTo(res) >= 0)) continue;
            for (int i = s.length() - 1; i > 0; i--) {
                if (!strings.get(i).contains(s.substring(0, i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                maxLength = s.length();
                res = s;
            }
            flag = true;
        }
        return res;
    }
}
