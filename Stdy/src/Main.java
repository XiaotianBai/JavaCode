import com.myjava.Practice.Classtest.GenericTest;
import com.myjava.Practice.Util.Human;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;
import java.util.logging.LogRecord;

import com.myjava.Practice.Classtest.ClassTest;
import com.myjava.Practice.Classtest.SubTest;

/**
 * my first java program
 * helps to understand java
 */
public class Main implements Filter{
    public boolean isLoggable(LogRecord record) {
        return false;
    }
    public static void main(String[] args) throws IOException {

        //Logger Configuration
        Handler myHandler = new ConsoleHandler();
        FileHandler myFileHandler = new FileHandler("%h/gitjava/java%u.log",true);
        Filter myFilter = record -> {
            return record.getMessage().contains("ENTRY");
        };
        myHandler.setLevel(Level.FINER);
        final Logger myLogger = Logger.getLogger("1");
        myLogger.addHandler(myHandler);
        myLogger.addHandler(myFileHandler);
        myLogger.setFilter(myFilter);
        myLogger.setLevel(Level.FINER);
        myLogger.setUseParentHandlers(false);
        myLogger.log(Level.FINE,"LogTest");
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {Logger.getGlobal().log(Level.WARNING, "uncaught");
        });
        Thread.dumpStack();

        //Logger Configuration

        //Methods Tests
        int i1 = 0;
        ClassTest ct1 = new ClassTest("ss", "dd");
        Scanner scan = new Scanner(System.in);
        String s1 = "abcdefg";
        String s2 = s1.replace("a", "z");
        myLogger.logp(Level.WARNING, "Main2", "Main2","Logp");
        myLogger.entering("Main1", "Main1", new Object[]{s1,s2});
        myLogger.log(Level.INFO,"LogTest");
        myLogger.exiting("Main1", "Main1", "finished");
        // System.out.println(s1);
        //  System.out.println(s2);
        //     String s1 = scan.nextLine();
        double d1 = -100000 / 3.0;
        System.out.printf("%s %s", d1, ct1.getName());
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

        //   ct1.dididi();

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
        ArrayList<SubTest> arr1 = new ArrayList<SubTest>();
        ArrayList ar2 = new ArrayList<>();
        ArrayList<Integer> ar3 = new ArrayList<Integer>();
        sub1.ManArrayList(arr1);
        System.out.println(sub1.getName());
        // arr1.add(new Human("gege"));
        System.out.println(arr1.toString());
        System.out.println(si);
        System.out.printf("%d%s\n", new Integer(10),"hao");
        BXT.printTest();
        System.out.println(double[].class);

        //Exception Tests
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
        //Generic Programming Test

        GenericTest<String> g1= new GenericTest(1,1);
        if(g1.compareByItself()) System.out.println("yes");
        System.out.println(GenericTest.getMiddle(10,15,25));


    }

}

