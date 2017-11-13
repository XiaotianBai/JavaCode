package Algorithm.LeetCode;

public class ReverseStringII {
    public static void main(String[] args)
    {
        System.out.println(reverseStr("abcdefg", 2));
    }

    public static String reverseStr(String s, int k)
    {
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int length = s.length();
        int i = 0;
        while(i < (length - 2*k)) {
            for(int j =  0; j < k; j++) {
                temp.append(s.charAt(i));
                i++;
            }
            ans.append(temp.reverse());
            temp = new StringBuilder();
            for(int j =  0; j < k; j++) {
                temp.append(s.charAt(i));
                i++;
            }
            ans.append(temp);
            temp = new StringBuilder();
        }
        while(i <= (length - k)){
            temp.append(s.charAt(i));
            i++;
        }
        ans.append(temp.reverse());
        temp = new StringBuilder();
        while(i < length) {
            temp.append(s.charAt(i));
            i++;
        }
        ans.append(temp);
        return ans.toString();
    }
}
