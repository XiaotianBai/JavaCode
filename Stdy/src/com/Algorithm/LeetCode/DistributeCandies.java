package com.Algorithm.LeetCode;

import java.util.*;

public class DistributeCandies {
    public static void main(String[] args)
    {
        int[] candies = {1,1,2,3};
        System.out.print(distributeCandies(candies));

    }

    public static int distributeCandies(int[] candies)
    {
        int position = 0;
        int sisterTypes = 0;
        Set<Integer> types = new HashSet<>();
        for(int i = 0; i < candies.length; i ++)
        {
            int temp = 0;
            if(!types.contains(candies[i]))
            {
                types.add(candies[i]);
                if(i > 0) position += 1;
                if(position >= candies.length / 2) break;
                temp = candies[position];
                candies[position] = candies[i];
                candies[i] = temp;

            }

        }
        types.clear();
        for(int i = 0; i < candies.length / 2; i ++)
        {
            if(!types.contains(candies[i]))
            {
                types.add(candies[i]);
                sisterTypes += 1;
            }
        }
        return sisterTypes;
    }
}
