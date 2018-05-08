package com.Algorithm.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {
    public static void main(String[] args) {
        int[][] points = {{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        System.out.print(numberOfBoomerangs(points));
    }

    public static int numberOfBoomerangs(int[][] points) {
        int leng = points.length;
        int ans = 0;
        for (int i = 0; i < leng; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < leng; j++) {
                if (j == i) continue;
                double dis = getDistance(points[i], points[j]);
                if (map.containsKey(dis)) {
                    map.put(dis, map.get(dis) + 1);
                } else map.put(dis, 1);
            }
            for (Double key : map.keySet()) ans += map.get(key) * (map.get(key) - 1);
        }
        return ans;
    }

    private static double getDistance(int[] pointOne, int[] pointTwo) {
        return Math.sqrt((pointOne[0] - pointTwo[0]) * (pointOne[0] - pointTwo[0]) +
                (pointOne[1] - pointTwo[1]) * (pointOne[1] - pointTwo[1]));
    }
}
