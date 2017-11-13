package com.Algorithm.LeetCode;

public class CountBinarySubstrings {
    public static void main(String[] args)
    {
        String s = "101101";
        System.out.println(countBinarySubstrings(s));
    }

    public static int countBinarySubstrings(String s)
    {
        int current = 1;
        int former = 0;
        int count = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < s.length(); i++)
        {
            if(i != s.length() -1 && chars[i] == chars[i + 1]) current += 1;
            else {
                if(former != 0)count += Math.min(current, former);
                former = current;
                current = 1;}
        }
        return count;
    }
}
