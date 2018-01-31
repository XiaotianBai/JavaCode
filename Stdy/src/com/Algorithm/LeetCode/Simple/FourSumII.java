package com.Algorithm.LeetCode.Simple;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {
    public static void main(String[] args){
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0,2};
        System.out.print(fourSumCount(A,B,C,D));
    }

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D){
        int ans = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int aA : A) {
            for (int bB : B) {
                int key = aA + bB;
                int fre = freq.getOrDefault(aA + bB, 0);
                freq.put(key, fre + 1);
            }
        }
        for (int cC : C) {
            for (int dD : D) {
                int key = -cC - dD;
                if(freq.containsKey(key)) ans += freq.get(key);
            }
        }
        return ans;

    }
}
