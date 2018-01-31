package com.Algorithm.LeetCode.Simple;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args)
    {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n)
    {
        String[] strings = new String[n];
        for(int i = 1; i < n + 1; i ++)
        {
            if((i % 3) == 0 && (i % 5) == 0)
            strings[i - 1] = "FizzBuzz";
            else if((i % 3) == 0) strings[i - 1] = "Fizz";
            else if((i % 5) == 0) strings[i - 1] = "Buzz";
            else strings[i - 1] = Integer.valueOf(i).toString();
        }
            return Arrays.asList(strings);
    }
}
