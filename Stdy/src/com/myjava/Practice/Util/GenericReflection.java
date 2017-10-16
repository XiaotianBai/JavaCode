package com.myjava.Practice.Util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Scanner;

public class GenericReflection {
    public static void main(String[] args)
    {
        String name;
        ArrayList ar = new ArrayList();
        LinkedList lin = new LinkedList();
        if(ar instanceof RandomAccess) System.out.println("Arraylist supports random access");
        if(lin instanceof RandomAccess) System.out.println("Linkedlist supports random access");

        if(args.length > 0) name = args[0];
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input the class name e.g. java.util.collections");
            name = scanner.next();
        }

        try
        {
            Class<?> cl = Class.forName(name);
            printClass(cl);
            for (Method method : cl.getDeclaredMethods())
            {printMethod(method);}
        }
        catch (ClassNotFoundException e){e.printStackTrace();}
    }
    public static void printClass(Class<?> cl)
    {
        System.out.println(cl);

    }
    public static void printMethod(Method method)
    {
        String name = method.getName();
        System.out.println(name);
    }
}
