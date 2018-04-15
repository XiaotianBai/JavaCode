package com.myjava.Practice.Util;

import com.myjava.Practice.Classtest.ClassTest;

public class Human {
    private static String s = "pooo";
    private int Age;
    private int height;
    private String name = "unknown";

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public static String poo() {
        return s;
    }


    public int jimbo() {
        Age = 10;
        height = 20;
        return Age;
    }

    public int nestjimbo() {
        ClassTest ct = new ClassTest("oo", "kk");
        return ct.GetBXTAge();
    }

    public String toString() {
        return this.name;
    }

    public enum Size {SMALL, MEDIUM, LARGE}

    public enum Size2 {
        SMALL("S"), MEDIUM("M"), LARGE("L");
        private String info;

        Size2(String info) {
            this.info = info;
        }

        public String getInfo() {
            return this.info;
        }
    }

    public void printTest() {
        Size2 sz2 = Size2.SMALL;
        System.out.println(sz2);
        System.out.println(sz2.getInfo());
    }

    Size[] ss = Size.values();
    Size sz = Enum.valueOf(Size.class, "SMALL");
    jiji jjj = new jiji(10);
    int jji = jjj.jijiage();
    int jjji = jjj.jijijimbo();

    public class jiji {
        public jiji(int i) {
            Age = i;
        }

        public int jijiage() {
            return Age;
        }

        public final void jijilength(int i) {
            System.out.println(i);
        }

        public int jijijimbo() {
            return Human.this.jimbo();
        }
    }

}

