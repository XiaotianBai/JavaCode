package com.Algorithm;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertionSort
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner in = new Scanner(System.in);

//        while(in.hasNext() && in.nextLine() != "z")
//        {
//            al.add(Integer.getInteger(in.next()));
//        }
        Integer[] numbers = {2017,4,3,9,6,7,1};
        al.addAll(Arrays.asList(numbers));
        int i =1;
        sort(al);
        System.out.print(al);
        //for(int i = 2; i < al.size(); i++)

    }
    public static void sort(ArrayList<Integer> al)
    {        int i =1;
        while(i < al.size())
        {
            int j = i - 1;
            int key = al.get(i);
            while(j >= 0 && al.get(j) > key)
            {
                al.set(j+1, al.get(j));
                al.set(j, key);
                //  key = al.get(i);
                j = j - 1;
            }
            i = i + 1;
        }

    }
}
