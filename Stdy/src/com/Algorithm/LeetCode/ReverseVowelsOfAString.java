package com.Algorithm.LeetCode;

import java.util.ArrayList;

public class ReverseVowelsOfAString {
    public static void main(String[] args){
        System.out.print(reverseVowels("aA"));
    }

    private static String reverseVowels(String s){
        char[] chars = s.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        for(char c : chars) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                vowels.add(c);
        }
        int size = vowels.size();
        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                chars[i] = vowels.get(size - 1);
                size --;
            }

        }
        return String.valueOf(chars);
    }
}
// better solution: two iterator from both end, when the "i" iterator finds a vowel, the "j" iterator starts
// looking for a vowels from the other end, exchange theses two vowels(if found)