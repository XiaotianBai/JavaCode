package com.Algorithm.LeetCode;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "D";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        return (word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()) || word.substring(1).equals(word.toLowerCase().substring(1)));
    }
}
