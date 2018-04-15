package com.myjava.Practice.Classtest;

public class GenericTest<T> {
    private T left;
    private T right;

    public GenericTest(T first, T second) {
        this.left = first;
        this.right = second;
    }

    public static <T> boolean compare(T first, T second) {
        if (first.getClass() != second.getClass()) return false;
        else if (first.equals(second)) return true;
        return false;
    }

    public boolean compareByItself() {
        if (this.left.getClass() != this.right.getClass()) return false;
        else if (this.left.equals(this.right)) return true;
        return false;
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }


}
