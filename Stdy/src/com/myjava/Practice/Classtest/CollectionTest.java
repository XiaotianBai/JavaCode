package com.myjava.Practice.Classtest;

import com.myjava.Practice.Util.Human;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        // hashsetTest();
        // treesetTest();
        // priorityQueueTest();
        // linkedMapTest();
        // printNum.B.getNumVal();
        enumTest();
        // subrangeTest();
        bulkOperationTest();
        System.out.println("\nend");
    }

    public enum printNum {
        A(104), B(203);

        private int numValue;

        printNum(int numVal) {
            this.numValue = numVal;
            //   System.out.println("printing"+this.numVal);
        }

        public int getNumVal() {
            System.out.println("printing" + this.numValue);
            return numValue;
        }
    }

    public enum Jobs {
        Teacher, Farmer, Soldier
    }

    public static void enumTest() {
        EnumSet<printNum> strings = EnumSet.noneOf(printNum.class);
        strings.add(printNum.A);
        System.out.print(strings);
        System.out.print(printNum.A.getNumVal());
        EnumMap<Jobs, Human> Neighbors = new EnumMap<>(Jobs.class);
        Neighbors.put(Jobs.Farmer, new Human("Tom"));
        Neighbors.put(Jobs.Soldier, new Human("James"));
        Neighbors.put(Jobs.Teacher, new Human("Cart"));
        System.out.print(Neighbors);
    }

    public static void linkedMapTest() {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(4, "fourth");
        map.put(1, "first");
        map.put(2, "second");
        map.put(3, "third");
        Set<Integer> set = map.keySet();
        Collection<String> al = map.values();
        Set<Map.Entry<Integer, String>> entryset = map.entrySet();

        entryset.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
        System.out.print(al);
        System.out.println(set);
        //  System.out.println(entryset);


    }

    public static void mapTest() {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "fourth");
        map.put(1, "first");
        map.put(2, "second");
        map.put(3, "third");
        Set<Integer> set = map.keySet();
        Collection<String> al = map.values();
        Set<Map.Entry<Integer, String>> entryset = map.entrySet();

        entryset.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
        System.out.print(al);
        System.out.println(set);
        //  System.out.println(entryset);


    }

    public static void priorityQueueTest() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(3);
        pq.add(9);
        pq.add(6);
        Iterator<Integer> iter = pq.iterator();
        while (iter.hasNext()) System.out.print(iter.next());
        //  for (Integer i : pq) System.out.print(i);
        while (!pq.isEmpty())
            System.out.println(pq.poll());
    }


    public static void treesetTest() {
        SortedSet<String> sorter = new TreeSet<>();
        sorter.add("ac");
        sorter.add("b");
        sorter.add("cde");
        sorter.add("d");
        System.out.print(sorter);
        NavigableSet<String> sorter2 = new TreeSet<>(Comparator.comparing(String::length));

        sorter2.addAll(sorter);

        System.out.print("\n" + sorter2);
    }

    public static void hashsetTest() {
        long totaltime = 0;
        HashSet<String> hs = new HashSet<>(100, 0.75f);
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                hs.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totaltime += callTime;
            }

        }
        Iterator<String> iter = hs.iterator();
        for (int i = 1; i < 10 && iter.hasNext(); i++)
            System.out.println(iter.next());
        System.out.println("size" + hs.size() + "time" + totaltime);
    }

    public static void subrangeTest() {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("cd");
        strings.add("efg");
        strings.add("adding");
        strings.removeIf(s -> s.contains("a"));
        strings.replaceAll(String::toUpperCase);
        int i = Collections.binarySearch(strings, "B");
        System.out.println(i);
        List<String> sub = Collections.unmodifiableList(strings);
        // sub.add("c");
        System.out.println(sub);

    }

    public static void checkedListTest() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList rawlist = integerArrayList;
        rawlist.add("g");
        List<Integer> integers = Collections.checkedList(integerArrayList, Integer.class);
        //integers.add("test");
    }

    public static void bulkOperationTest() {
        Set<String> hash1 = new HashSet<>(100, 0.75f);
        Set<String> hash2 = new HashSet<>(100, 0.75f);
        Set<String> hash3 = new HashSet<>(100, 0.75f);
        hash2.add("a2");
        hash2.add("b2");
        hash2.add("c");
        hash2.add("d");
        hash3.add("a3");
        hash3.add("b3");
        hash3.add("c");
        hash3.add("d");

        hash1.addAll(hash2);
        hash1.retainAll(hash3);
        System.out.print(hash1);


        String[] stringArray = {"aa", "bb", "cc"};
        HashSet<String> hash4 = new HashSet<>(Arrays.asList(stringArray));
        stringArray = hash4.toArray(new String[hash4.size()]);
        System.out.println("\n" + hash4);
        System.out.println(stringArray[1]);
    }

    public static void playGround() {

    }
}
