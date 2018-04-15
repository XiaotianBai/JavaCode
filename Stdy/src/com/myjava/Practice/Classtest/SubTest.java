package com.myjava.Practice.Classtest;

import com.myjava.Practice.Util.Human;

import java.util.ArrayList;

public class SubTest extends ClassTest {

    public int clonei = 0;

    public SubTest() {
    }

    public SubTest(String s1, String s2) {
        super(s1, s2);

    }

    public String getName() {
        assert super.getName() != null : "null name";

        String name = super.getName();
        return name + "sub";
    }

    public String GetName2() {
        //  assert super.getName() != null;
        //   String name = super.GetName();
        return "gg";
    }

    public int testfn() {
        int x = 10;
        return x;
    }

    public void ManArrayList(ArrayList array) {
        Human LQ = new Human("xiexie");
        array.add(LQ);
    }

    public int compareTo(SubTest other) {
        // return Integer.compare(this.i, other.i);
        return i - other.i;
    }

    @Override
    public SubTest Clone() throws CloneNotSupportedException {
        SubTest clone = (SubTest) super.Clone();
        return clone;

    }

}
