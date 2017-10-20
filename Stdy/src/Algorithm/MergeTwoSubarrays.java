package Algorithm;

import java.util.Arrays;

public class MergeTwoSubarrays
{
    public static void main(String[] args)
    {
        Integer[] array = {111,222,333 ,3, 444,9, 6, 55, 8, 8, 2017, 666666, 123456, 8 };
        mergeSort(array, 0,13);
        System.out.print(Arrays.asList(array));
    }

    public static void mergeSort(Integer[] array, int startpoint, int endpoint)
    {

        int midpoint = (int)Math.floor((startpoint+endpoint)/2);
       // System.out.print(midpoint);
        if(startpoint < (endpoint - 1))
        {
            midpoint = (int)Math.floor((startpoint+endpoint)/2);
            mergeSort(array, startpoint, midpoint);
            mergeSort(array, (midpoint+1), endpoint);

        }
        merge(array, startpoint, midpoint, endpoint);
    }

    public static void merge(Integer[] array, int startpoint, int breakpoint, int endpoint)
    {
        if(endpoint >= array.length || breakpoint < startpoint || breakpoint > endpoint) throw new StackOverflowError();
        Integer[] leftSubarray = Arrays.copyOfRange(array, startpoint, breakpoint+1);
        Integer[] rightSubarray = Arrays.copyOfRange(array, breakpoint+1, endpoint+1);

        int m = 0;
        int n = 0;
        for(int i = startpoint; i < (endpoint + 1); i++)
        {
            if (n >= (endpoint - breakpoint) || (m < (breakpoint - startpoint + 1) && leftSubarray[m] <= rightSubarray[n]))
            {
                array[i] = leftSubarray[m];
                m++;
            }
            else
            {
                array[i] = rightSubarray[n];
                n++;
            }

        }

    }


}
