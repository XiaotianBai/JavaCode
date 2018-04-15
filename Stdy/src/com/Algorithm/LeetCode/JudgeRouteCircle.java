package com.Algorithm.LeetCode;


public class JudgeRouteCircle {

    public static void main(String[] args) {
        String move = "UDUDLL";
        System.out.print(Solution(move));
    }

    public static boolean Solution(String moves) {
        boolean answer;
        int u = 0, d = 0, l = 0, r = 0;
        char[] move = moves.toCharArray();
        for (int i = 0; i < move.length; i++) {
            switch (move[i]) {
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'L':
                    l++;
                    break;
                case 'R':
                    r++;
                    break;
            }
        }
        if ((u == d) && (l == r)) answer = true;
        else answer = false;
        return answer;
    }
}
