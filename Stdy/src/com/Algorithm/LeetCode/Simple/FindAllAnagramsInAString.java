package com.Algorithm.LeetCode.Simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args){
        String s = "abadddddddba";
        String p = "ab";
        String ss = "cbaebabacd";
        String pp = "abc";
        System.out.print(findAnagrams2(s,p));
        System.out.print(findAnagrams2(ss,pp));
    }

    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.equals(p)){
            res.add(0);
            return res;
        }
        int leng = p.length();
        int limit = s.length() - leng + 1;
        char[] cp = p.toCharArray();
        char[] cs = s.toCharArray();
        int[] ci = new int[128];
        for(char c : cp) ci[c] ++;
        for(int i = 0; i < limit; i ++){

            for(int j = i; j < i + leng; j++){
                if(ci[cs[j]] == 0){
                    i = j + 1;
                    break;
                }
            }
            if(i < limit && helper(s.substring(i, i + leng), p)) {
                res.add(i);
                while(i < limit - 1 && cs[i] == cs[i + leng]){
                    i++;
                    res.add(i);

                }
            }
        }
        return res;
    }

    private static boolean helper(String s, String p){
        char[] sc = s.toCharArray();
        char[] pc = p.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(pc);
        for(int i = 0; i < sc.length; i++){
            if(sc[i] != pc[i]) return false;
        }
        return true;
    }
    private static List<Integer> findAnagrams2(String s, String p) {
        List<Integer> result = new ArrayList();

        int[] counts = new int[128];
        for (char c : p.toCharArray()) {
            counts[c]++;
        }
        int count = p.length();
        int[] sCounts = new int[128];

        final char[] sChars = s.toCharArray();
        int start = 0;
        for (int i = 0; i < sChars.length; i++) {
            final char c = sChars[i];
            sCounts[c]++;
            count--;
            while (sCounts[c] > counts[c]) {
                sCounts[sChars[start++]]--;
                count++;
            }
            if (count == 0) {
                result.add(start);
                sCounts[sChars[start++]]--;
                count++;
            }
        }
        return result;
    }

}
