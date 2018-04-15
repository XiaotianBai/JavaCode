package com.Algorithm.LeetCode;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean flag = false;
        char[] ca1 = ransomNote.toCharArray();
        char[] ca2 = magazine.toCharArray();
        for (char c1 : ca1) {
            for (int i = 0; i < ca2.length; i++) {
                if (ca2[i] == c1) {
                    flag = true;
                    ca2[i] = '?';
                    break;
                }
            }
            if (!flag) return false;
            flag = false;
        }
        return true;
    }
}
