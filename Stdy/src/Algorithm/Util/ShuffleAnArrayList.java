package Algorithm.Util;

import java.util.*;
import Algorithm.InsertionSort;

public class ShuffleAnArrayList {
    public static void main(String[] args)
    {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> test = new ArrayList<>();
        test.addAll(Arrays.asList(numbers));
        shuffleBySorting(test);
        System.out.print(test);
    }

    public static <T> void shuffleBySorting(ArrayList<T> arrayList)
    { int size = arrayList.size();
       Random random = new Random();
       ArrayList<Integer> priority = new ArrayList<>(size);
       Map<Integer, T> map = new HashMap<>();

       for(int i = 0; i < size; i++)
       {
           Integer p = random.nextInt(size^3);
           while(map.containsKey(p))
           {
               ++p;
           }
           priority.add(p);
           map.put(p, arrayList.get(i));
       }
       InsertionSort.sort(priority);
        for(int i = 0; i < size; i++)
        {
            arrayList.set(i, map.get(priority.get(i)));
        }
    }
}
