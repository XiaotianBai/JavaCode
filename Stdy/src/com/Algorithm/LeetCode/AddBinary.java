package com.Algorithm.LeetCode;

public class AddBinary {
    public String addBinary(String a, String b) {
        int al = a.length();
        int bl = b.length();
        if (al == 0) return b;
        if (bl == 0) return a;
        if (al < bl) {
            String c = b;
            b = a;
            a = c;
            al = a.length();
            bl = b.length();
        }
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int carry = 0;
        char[] res = new char[al];
        for (int i = 1; i <= bl; i++) {
            int sum = ac[al - i] + bc[bl - i] - 96;
            res[al - i] = (char) (48 + (sum + carry) % 2);
            carry = ((sum + carry) >= 2) ? 1 : 0;
        }
        for (int i = bl + 1; i <= al; i++) {
            res[al - i] = (char) (48 + (ac[al - i] + carry - 48) % 2);
            carry = (ac[al - i] + carry - 48 >= 2) ? 1 : 0;
        }
        String s = new String(res);
        if (carry == 1) s = "1" + s;
        return s;
    }
}

