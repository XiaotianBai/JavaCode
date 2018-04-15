package com.myjava.Practice.Classtest;

public class Pair<T> implements Comparable {
    private T first;
    private T second;
    private T third;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static <T extends Comparable> int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }

    @Override
    public int compareTo(Object o) {
        if (this.getClass() != o.getClass()) return 1;
        else return 0;
    }


    public static void main(String[] args) {
        ClassTest ct1 = new ClassTest();
        ClassTest ct2 = new ClassTest();
        SubTest st1 = new SubTest();
        SubSubTest sst1 = new SubSubTest();
        Pair<ClassTest> ptest = new Pair<>(ct1, ct2);
        Pair<? extends ClassTest> ptest2 = ptest; //Wildcard types test
        Pair<? super SubTest> ptest3 = ptest;
        ptest3.setFirst(sst1);
        System.out.print(ptest3.getFirst().toString());
        Pair<String> p1 = new Pair<>("ps1", "ps2");
        System.out.print(Pair.compare("ps1", "ps1"));
    }


}
