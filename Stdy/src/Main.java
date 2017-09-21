import javafx.scene.media.SubtitleTrack;

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
        SubTest[] subs = new SubTest[5];
        SubTest sub1 = new SubTest();
        System.out.println(sub1.testfn());
        ClassTest[] tsts = subs;
        tsts[0] = sub1;
        tsts[0].GetBXTAge();
        
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
    }

}

class Human {
    private static String s = "pooo";
    private int age;
    private int height;
    private String name;
    public Human(){}
    public Human(String name){this.name = name;}
    public static String poo() {
        return s;
    }


    public int jimbo() {
        age = 10;
        height = 20;
        return age;
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

}

