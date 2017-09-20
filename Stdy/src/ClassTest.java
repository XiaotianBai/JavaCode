import java.util.ArrayList;

public class ClassTest {
    Human BXT = new Human();
    private String name;
    private String job;

    public ClassTest() {
    }

    public ClassTest(String s1, String s2) {
        this.name = s1;
        this.job = s2;

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
}