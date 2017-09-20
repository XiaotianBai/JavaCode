import javafx.scene.media.SubtitleTrack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * my first java program
 * helps to understand java
 */
public class Main {

    public static void main(String[] args)
    {
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

        ArrayList<SubTest> ar1 = new ArrayList<SubTest>();
        sub1.ManArrayList(ar1);
       // ar1.add(new Human("gege"));
        System.out.println(ar1.toString());
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

}

