package com.Algorithm.LeetCode;

import java.util.Arrays;

public class CustomSortString {
    public String customSortString(String S, String T) {
        char[] sArray = S.toCharArray();
        int[] order = new int[26];
        Arrays.fill(order, -1);
        char[] charOrder = new char[26];
        int[] frequency = new int[S.length()];
        Arrays.fill(frequency, 0);
        char[] others = new char[T.length()];
        char[] sortedArray = new char[T.length()];
        int othersCount = 0;
        int sortedPos = 0;
        for (int i = 0; i < sArray.length; i++) {
            order[sArray[i] - 'a'] = i;
            charOrder[i] = sArray[i];
        }

        char[] tArray = T.toCharArray();

        for (char c : tArray) {
            if (order[c - 'a'] != -1) {
                frequency[order[c - 'a']]++;
            } else {
                others[othersCount] = c;
                othersCount++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                for (int j = frequency[i]; j > 0; j--) {
                    sortedArray[sortedPos] = charOrder[i];
                    sortedPos++;
                }
            }
        }

        for (int i = othersCount; i > 0; i--) {
            sortedArray[sortedPos] = others[i - 1];
            sortedPos++;
        }

        return String.valueOf(sortedArray);

    }
}
