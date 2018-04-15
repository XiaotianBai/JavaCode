package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class OnebitAndTwobitCharacters {
    public static void main(String[] args) {
        int[] bits = {0, 1, 0};
        System.out.println(isOneBitCharacter(bits));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        List<Integer> list = new ArrayList<>();
        for (int i : bits) list.add(i);
        list.remove(list.size() - 1);
        int j = 0;
        while (list.size() >= 2 && j < (list.size() - 1)) {
            if (list.get(j) == 1 && list.get(j + 1) == 1) {
                list.remove(j);
                list.remove(j);
                j -= 1;
            }
            j++;
        }
        if (list.isEmpty()) return true;
        if (list.get(list.size() - 1) == 1) return false;
        for (int k = 0; k < list.size() - 1; k++) {
            if (list.get(k) == 1) {
                if (list.get(k + 1) != 0) return false;
            }
        }
        return true;
    }
}
