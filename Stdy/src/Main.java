import com.Algorithm.LeetCode.*;
import javafx.util.Pair;

import java.util.*;

/**
 * This is Xiaotian's Java code collection
 */
class Father {
    String name = "pp";
    int i = 10;

    public void getI() {
        System.out.println(name);
    }
}

class Son extends Father {
    int i = 10;
    int ii = 5;
    String name;
    public Son(int iii) {
        name = "ff";
        i = iii;
        ii = iii * 2;
    }
    public void getUnit() {
        System.out.println(this.ii);
    }
}

public class Main {
    public static void main(String[] args) {
        Son son = new Son(5);
        System.out.println(son.i);
        System.out.println(son.i);


        Son parent = new Son(15);
        parent.getI();
        System.out.println(parent.name);
    }
}
