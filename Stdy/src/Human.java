import com.myjava.Practice.Classtest.ClassTest;

public class Human {
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
