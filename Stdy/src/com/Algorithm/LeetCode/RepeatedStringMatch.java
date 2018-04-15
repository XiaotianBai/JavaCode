package com.Algorithm.LeetCode;

public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        int la = A.length(), lb = B.length();
        if (A.equals(B)) return 1;
        int res = 1;
        StringBuilder sb = new StringBuilder(A);
        while (sb.length() < lb) {
            res++;
            sb.append(A);
        }
        int maxLength = (la < lb) ? lb + 2 * la - 2 : 2 * la;
        while (sb.length() <= maxLength) {
            if (helper(sb.toString(), B)) return res;
            else {
                res++;
                sb.append(A);
            }
        }
        return -1;
    }

    //check if B is a substring of A
    public boolean helper(String A, String B) {
        int la = A.length(), lb = B.length();
        if (A.equals(B)) return true;
        else if (la == lb) return false;
        for (int i = 0; i <= (la - lb); i++) {
            if (A.substring(i, i + lb).equals(B)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedStringMatch t = new RepeatedStringMatch();
        System.out.print(t.repeatedStringMatch("abcd", "cdabcdab"));
    }
}
