import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.function.IntConsumer;

interface TestInterface
{
    String getName();
}

public class ClassTest implements Comparable<ClassTest>, TestInterface, ActionListener, Cloneable, IntConsumer {
    Human BXT = new Human();


    private String name;
    private String job;
    public Integer i = 10;

    public ClassTest() {
    }

    public ClassTest(String s1, String s2) {
        this.name = s1;
        this.job = s2;

    }

    public String getName(){return this.name;}

   public ClassTest Clone() throws CloneNotSupportedException
   {
       ClassTest clone = (ClassTest)super.clone();
       return clone;
   }

    public void actionPerformed(ActionEvent event)
    {
        System.out.println("didi");

        //Toolkit.getDefaultToolkit().beep();
    }


    public void didi()
    {
       // System.out.println("didi");
        ActionListener listener = new ClassTest();
        Timer t =new Timer(1000, System.out::println);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        return;
        //System.exit(0);
    }

    public int compareTo(ClassTest other)
    {
        // return Integer.compare(this.i, other.i);
        return i - other.i;
    }

    public void accept(int value){}

    public static void repeat(int n, IntConsumer action)
    {
        for(int i=0; i < n; i++) action.accept(i);
    }

    public void dididi()
    {
        repeat(10, i->System.out.println(i));
        JOptionPane.showMessageDialog(null, "Quit program?");
        return;

    }
    public String GetName() {
        return this.name;
    }

    public String GetJob() {
        return this.job;
    }

    public int GetBXTAge() {
        return BXT.jimbo();
    }


}

class SubTest extends ClassTest {

    public int clonei = 0;

    public SubTest() {
    }

    public SubTest(String s1, String s2) {
        super(s1, s2);

    }

    public String GetName() {
        String name = super.GetName();
        return "gg";
    }

    public int testfn(){
        int x = 10;
        return x;
    }

    public void ManArrayList(ArrayList array)
    {
        Human LQ = new Human("xiexie");
        array.add(LQ);
    }
    public int compareTo(SubTest other)
    {
        // return Integer.compare(this.i, other.i);
        return i - other.i;
    }

    @Override public SubTest Clone() throws CloneNotSupportedException
    {
        SubTest clone = (SubTest) super.Clone();
        return clone;

    }

}