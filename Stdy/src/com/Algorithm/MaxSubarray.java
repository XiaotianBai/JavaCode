package com.Algorithm;

import java.util.Arrays;

public class MaxSubarray
{
    public static void main(String[] args)
    {
        int[] array = {-3,-2,-1,1,2,3,-1};
       // Integer[] solution = findCrossingSubarray(array, 0,2,4);
        int[] solution = findMaxSubarray(array,0,6);
        System.out.print(Arrays.toString(solution));
    }

    public static int[] findCrossingSubarray(int[] array, int startpoint, int midpoint, int endpoint)
    {
        int sum = 0;
        int max = 0;
        int leftpoint = midpoint;
        int rightpoint = midpoint;
        for (int i = midpoint; i <= endpoint; i++)
        {
            sum += array[i];
            if(i == midpoint) max = sum;
            if (sum > max)
            {
                max = sum;
                rightpoint = i;
            }
        }
        sum = max;
        for (int i = (midpoint -1); i >= startpoint; i--)
        {
            sum += array[i];
            if(sum > max)
            {
                max = sum;
                leftpoint = i;
            }
        }
        return new int[] {leftpoint, rightpoint, max};
    }

    public static int[] findMaxSubarray(int[] array, int startpoint, int endpoint)
    {
        int[] max;
        if(startpoint == endpoint) return new int[] {startpoint, endpoint, array[startpoint]};
        else
        {
            int midpoint = (int)Math.floor((startpoint + endpoint)/2);
            int[] left = findMaxSubarray(array, startpoint, midpoint);
            int[] right = findMaxSubarray(array, (midpoint + 1), endpoint);
            int[] crossing = findCrossingSubarray(array, startpoint, midpoint, endpoint);
            if(left[2] > right[2]) max = left;
            else max = right;
            if(crossing[2] > max[2]) max = crossing;
        }
        return max;

    }
}
