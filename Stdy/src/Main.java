import java.util.Scanner;

/**
 * my first java program
 * helps to understand java
 */
public class Main {

    public static void main(String[] args) {
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
    }
}

class Human {
    private static String s = "pooo";
    private int age;
    private int height;

    public static String poo() {
        return s;
    }

    public static void main(String[] args) {
        System.out.print(999);
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


}

