package com.Algorithm.LeetCode.Simple;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args){
        char[] chars = {'a','b','b','b','b','b','b','b'};
        char[] chars2 = {'a','a','b','b','c','c','c','c'};
        System.out.println(compress(chars2));
        System.out.println(Arrays.toString(chars2));

    }

    private static int compress(char[] chars) {
        int freq = 1;
        int pos = 0;
        char prevChar = chars[0];
        for(int i = 1; i < chars.length; i++){
            if(chars[i] == prevChar){
                freq ++;
            }
            else if(freq > 1){
                chars[pos++] = prevChar;
                char[] freqChar = String.valueOf(freq).toCharArray();
                for (char c : freqChar) {
                    chars[pos++] = c;
                }
                freq = 1;
                prevChar = chars[i];
            }
            else {
                chars[pos++] = prevChar;
                freq = 1;
                prevChar = chars[i];
            }
        }
        if(freq > 1){
            chars[pos++] = prevChar;
            char[] freqChar = String.valueOf(freq).toCharArray();
            for (char c : freqChar) {
                chars[pos++] = c;
            }
        }
        else {
            chars[pos++] = prevChar;
        }


        return pos;
    }
}
