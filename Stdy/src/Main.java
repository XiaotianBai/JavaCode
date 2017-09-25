import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * my first java program
 * helps to understand java
 */
public class Main {

    public static void main(String[] args){
        int i1 = 0;
        ClassTest ct1 = new ClassTest("ss", "dd");
        Scanner scan = new Scanner(System.in);
        String s1 = "abcdefg";
        String s2 = s1.replace("a", "z");
        System.out.println(s1);
        System.out.println(s2);
        //     String s1 = scan.nextLine();
        double d1 = -100000 / 3.0;
        System.out.printf("%s %s", d1, ct1.GetName());
        System.out.println("Hello World!");
        Human BXT = new Human();
        System.out.println(BXT.nestjimbo());
        System.out.println(Human.poo());
        SubTest[] subs = new SubTest[2];
        SubTest sub1 = new SubTest();
        try {
            sub1.clonei = 20;
            SubTest sub2 = sub1.Clone();
            System.out.println(sub2.clonei);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(sub1.testfn());
        ClassTest[] tsts = subs;
        tsts[0] = sub1;
        tsts[0].GetBXTAge();

        ct1.dididi();

        for (SubTest e : subs)
        {
            e = new SubTest();
            System.out.println(e.testfn());
        }
        Integer I1 = 10;
        Integer I2 = 10;
        if (I1 == I2)
            System.out.println("yes");
        I1.toString();
        String si = Integer.toString(10,6);
        ArrayList<SubTest> ar1 = new ArrayList<SubTest>();
        ArrayList ar2 = new ArrayList<>();
        ArrayList<Integer> ar3 = new ArrayList<Integer>();
        sub1.ManArrayList(ar1);
       // ar1.add(new Human("gege"));
        System.out.println(ar1.toString());
        System.out.println(si);
        System.out.printf("%d%s\n", new Integer(10),"hao");
        BXT.printTest();
        System.out.println(double[].class);
        try {
            Object BXT2 = BXT.getClass().newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        Class cl = BXT.getClass();
        Field f1 = null;
        try {
            f1 = cl.getDeclaredField("name");
            f1.setAccessible(true);
            System.out.println(f1.get(BXT));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Method m1 = Math.class.getMethod("sqrt", double.class);
            double y = (Double)m1.invoke(null, 0.5);
            System.out.println(y);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}

class Human {
    private static String s = "pooo";
    private int Age;
    private int height;
    private String name = "unknown";
    public Human(){}
    public Human(String name){this.name = name;}
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
    public String toString()
    {
        return this.name;
    }

    public enum Size{SMALL, MEDIUM, LARGE}

    public enum Size2
    {
        SMALL("S"), MEDIUM("M"), LARGE("L");
        private String info;
        Size2(String info){this.info = info;}
        public String getInfo(){return this.info;}
    }

    public void printTest()
    {
        Size2 sz2 = Size2.SMALL;
        System.out.println(sz2);
        System.out.println(sz2.getInfo());
    }
    Size[] ss = Size.values();
    Size sz = Enum.valueOf(Size.class, "SMALL");
    jiji jjj = new jiji(10);
    int jji = jjj.jijiage();
    int jjji = jjj.jijijimbo();

    public class jiji
    {
        public jiji(int i){Age = i;}
        public int jijiage(){return Age;}
        public final void jijilength(int i){System.out.println(i);}
        public int jijijimbo(){return Human.this.jimbo();}
    }

}

