import java.util.ArrayList;

public class StringPlay {
    private String myString;

    StringPlay(String myString) {
        this.myString = myString;
    }

    private void changeIfEqual(StringPlay a, StringPlay b, StringPlay c) {
        if (a.myString.equals(b.myString)) {
            b.myString = c.myString;
        }
    }

    public String replaceChar(String s, char gone, char here) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == gone) chars[i] = here;
        }
        return String.valueOf(chars);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

