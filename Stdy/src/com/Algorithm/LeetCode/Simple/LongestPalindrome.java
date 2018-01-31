package com.Algorithm.LeetCode.Simple;
public class LongestPalindrome{
    public static void main(String[] args){
        String s = "zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";


    }

    public static int longestPalindrome(String s){
        char[] chars = s.toCharArray();
        int[] freq = new int['z' - 'A' + 1];
        int ans = 0;
        for(char c : chars){
            if(freq[c - 'A'] == 1){
                ans += 2;
                freq[c - 'A'] = 0;
            }
            else freq[c - 'A'] ++;

        }
        if(s.length() == ans) return ans;
        else return ans + 1;

    }

}