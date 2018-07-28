package com.Algorithm.Other;

public class StringRegExp {

    public static void main(String[] args) {
        StringRegExp sre = new StringRegExp();
        System.out.println(sre.isMatch("aa", "a*"));
    }


    public boolean isMatch(String s, String p) {

        if (s == null || p == null) {
            return false;
        }
        char[] cs = s.toCharArray();
        char[] cp = p.toCharArray();
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (cp[i] == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        for (int i = 0; i < cs.length; i++) {
            for (int j = 0; j < cp.length; j++) {
                if (cp[j] == '.') {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (cp[j] == cs[i]) {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (cp[j] == '*') {
                    if (cp[j - 1] != cs[i] && cp[j - 1] != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i][j + 1] || dp[i + 1][j - 1]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    private boolean helper(char[] cs, int is, char[] cp, int ip) {
        while (is < cs.length) {
            if (ip >= cp.length) {
                return false;
            }
            char c = cp[ip];
            if (c == '.') {
                ip++;
                is++;
            } else if (c == '*') {
                if (ip == cp.length - 1) {
                    while (is != cp.length - 1) {
                        if (cs[is] != cs[is - 1]) return false;
                        is++;
                    }
                    return cs[is] == cs[is - 1];
                }
                ip++;
                if (is > 0 && helper(cs, is - 1, cp, ip)) return true;
                if (helper(cs, is, cp, ip)) return true;
                while (is < cs.length - 1 && ip < cp.length && cs[is + 1] == cs[is]) {
                    if (helper(cs, is, cp, ip)) return true;
                    is++;
                }
                return helper(cs, is, cp, ip);
            } else if (c == cs[is]) {
                is++;
                ip++;
            } else if (ip < cp.length - 1 && cp[ip + 1] == '*') {
                return helper(cs, is, cp, ip + 2);
            } else return false;
        }
        return is == cs.length && ip == cp.length;

    }
}
