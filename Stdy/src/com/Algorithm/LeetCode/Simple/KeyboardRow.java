package com.Algorithm.LeetCode.Simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args)
    {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.asList(findWords(words)));
    }

    public static String[] findWords(String[] words)
    {
        Character[] rowOne = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        Character[] rowTwo = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        Character[] rowThree = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i < words.length; i++)
        {
            int buf = 0;
            int secondaryBuf = 0;
            char[] chars = words[i].toLowerCase().toCharArray();
            if(Arrays.asList(rowOne).contains(chars[0])) buf = 1;
            if(Arrays.asList(rowTwo).contains(chars[0])) buf = 2;
            if(Arrays.asList(rowThree).contains(chars[0])) buf = 3;
            //System.out.print(buf);
            for(int j = 0; j < chars.length; j++)
            {
                if(Arrays.asList(rowOne).contains(chars[j])) secondaryBuf = 1;
                if(Arrays.asList(rowTwo).contains(chars[j])) secondaryBuf = 2;
                if(Arrays.asList(rowThree).contains(chars[j])) secondaryBuf = 3;
                if(secondaryBuf != buf){secondaryBuf = 0; break;}
            }
            if(secondaryBuf != 0) answer.add(words[i]);
        }
        return answer.toArray(new String[answer.size()]);
    }
}
