package com.myjava.Practice.Classtest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericCollection<T> {

    private T[] cl;

    public <T> void addAll(Collection<T> collection, T... ts) {
        for (T t : ts) {
            collection.add(t);
        }

        System.out.print(collection.toString());
    }

    public static void main(String[] args) {
        Collection<String> cs = new Collection<String>() {
            private ArrayList<String> al = new ArrayList<>();

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public String toString() {
                return al.toString();
            }

            @Override
            public <T> T[] toArray(T[] a) {

                return a;
            }

            @Override
            public boolean add(String s) {
                al.add(s);
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        GenericCollection<String> gc = new GenericCollection();
        gc.addAll(cs, "s1", "s2", "s3");
    }

}
