package com.Algorithm.LeetCode.Simple;

import java.util.Arrays;

public class ReverseWordsInAStringIII {
    public static void main(String[] args)
    {
        String s = "Lets play with him";
        System.out.println(Arrays.asList(reverseWords(s)));
    }

    public static String reverseWords(String s)
    {
        String[] split = s.split("\\s+");
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < split.length; i++)
        {
            String temp = split[i];
            char[] chars = temp.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = 0; j < (chars.length / 2 ); j++)
            {
                char tempChar = chars[j];
                chars[j] = chars[chars.length - j - 1];
                chars[chars.length - j - 1] = tempChar;
            }
            for(int k = 0; k < chars.length; k++)
                stringBuilder.append(chars[k]);
            split[i] = stringBuilder.toString();
        }
        for(int m = 0; m < (split.length -1) ; m++)
        {string.append(split[m]); string.append(" ");}
        string.append(split[split.length -1]);
        String answer = string.toString();
        return answer;
    }
}
