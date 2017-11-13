package com.Algorithm.Util;

import java.util.*;
import com.Algorithm.InsertionSort;

public class ShuffleAnArrayList {
    public static void main(String[] args)
    {
        String[] strings = {"a","b","c","d","e"};
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        ArrayList<String> stringTest = new ArrayList<>();
        stringTest.addAll(Arrays.asList(strings));
        ArrayList<Integer> integerTest = new ArrayList<>();
        integerTest.addAll(Arrays.asList(numbers));
        shuffleBySorting(integerTest);
        shuffleByPlace(stringTest);
        System.out.print(integerTest);
        System.out.println(" ");
        System.out.print(stringTest);
    }

    public static <T> void shuffleBySorting(ArrayList<T> arrayList)
    {
        int size = arrayList.size();
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

    public static <T> void shuffleByPlace(ArrayList<T> arrayList)
    {
        T temp;
        int size = arrayList.size();
        Random random = new Random();
        for(int i = 0; i < size; i++)
        {
            temp = arrayList.get(i);
            int next = random.nextInt(size - i) + i;
            arrayList.set(i, arrayList.get(next));
            arrayList.set(next, temp);
        }

    }
}
