package com.myjava.Practice.Classtest;

import com.myjava.Practice.Util.Human;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.IntConsumer;

interface TestInterface {
    String getName();
}

public class ClassTest implements Comparable<ClassTest>, TestInterface, ActionListener, Cloneable, IntConsumer {
    Human BXT = new Human();


    private String name = "default Name";
    private String job;
    public Integer i = 10;

    public ClassTest() {
    }

    public ClassTest(String s1, String s2) {
        this.name = s1;
        this.job = s2;

    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public String getName2() {
        return this.name;
    }

    public ClassTest Clone() throws CloneNotSupportedException {
        ClassTest clone = (ClassTest) super.clone();
        return clone;
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("didi");

        //Toolkit.getDefaultToolkit().beep();
    }


    public void didi() {
        // System.out.println("didi");
        ActionListener listener = new ClassTest();
        Timer t = new Timer(1000, System.out::println);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        return;
        //System.exit(0);
    }

    public int compareTo(ClassTest other) {
        // return Integer.compare(this.i, other.i);
        return i - other.i;
    }

    public void accept(int value) {
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) action.accept(i);
    }

    public void dididi() {
        repeat(10, i -> System.out.println(i));
        JOptionPane.showMessageDialog(null, "Quit program?");
        return;

    }

    public String GetJob() {
        return this.job;
    }

    public int GetBXTAge() {
        return BXT.jimbo();
    }

}

