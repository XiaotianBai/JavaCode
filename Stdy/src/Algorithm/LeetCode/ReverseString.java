package Algorithm.LeetCode;

public class ReverseString {
    public static void main(String[] args)
    {
        System.out.print(reverseString("hello"));
    }

    public static String reverseString(String s)
    {
        String answer;
        char[] chars = s.toCharArray();
        for(int j = 0; j < (chars.length / 2 ); j++)
        {
            char tempChar = chars[j];
            chars[j] = chars[chars.length - j - 1];
            chars[chars.length - j - 1] = tempChar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < chars.length; i++)
        {
            stringBuilder.append(chars[i]);
        }
        answer = stringBuilder.toString();
        return answer;
    }

}
