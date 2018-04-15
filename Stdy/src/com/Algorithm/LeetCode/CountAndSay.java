package com.Algorithm.LeetCode;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.print(countAndSay(4));
    }

    private static String countAndSay(int n) {
        int i = 1;
        String prev = "1";
        char prevChar;
        int prevFreq = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        while (i < n) {
            sb = new StringBuilder();
            prevChar = prev.charAt(0);
            for (int j = 0; j < prev.length(); j++) {
                char c = prev.charAt(j);
                if (c == prevChar) prevFreq++;
                else {
                    sb.append(prevFreq);
                    sb.append(prevChar);
                    prevChar = c;
                    prevFreq = 1;
                }
            }
            sb.append(prevFreq);
            sb.append(prevChar);
            prev = sb.toString();
            prevFreq = 0;
            i++;
        }
        return prev;
    }

}
