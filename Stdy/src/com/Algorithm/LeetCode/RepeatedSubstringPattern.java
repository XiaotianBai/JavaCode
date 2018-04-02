package com.Algorithm.LeetCode;

public class RepeatedSubstringPattern {
    public static void main(String[] args){
        System.out.print(repeatedSubstringPattern("aabbaabb"));
    }

    private static boolean repeatedSubstringPattern(String s){
        int l = s.length();
        for(int i = l / 2; i>=1; i--) {
            if(l % i == 0) {
                int m = l / i;
                String sub = s.substring(0,i);
                if(!s.substring(i, 2 * i).equals(sub)) continue;
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < m; j++) {
                    sb.append(sub);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
