package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args){
        System.out.print(getRow(3));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0) return list;

        for (int i = 0; i < rowIndex + 1; i++) {
            list.add(0,1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }
}
