package com.Algorithm.LeetCode.Simple;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStrings {
    public static void main(String[] args){
        String num1 = "18";
        String num2 = "194";
        System.out.print(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2){
        int flag = 0, i1 = 0, i2 = 0;
        StringBuilder s1 = new StringBuilder();
        s1.append(num1);
        StringBuilder s2 = new StringBuilder();
        s2.append(num2);
        char[] c1 = s1.reverse().toString().toCharArray();
        char[] c2 = s2.reverse().toString().toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < Math.max(c1.length, c2.length); i++){
            if(i >= c1.length) i1 = 0;
            else i1 = c1[i] - 48;

            if(i >= c2.length) i2 = 0;
            else i2 = c2[i] - 48;

            int sum = i1 + i2;
            if((sum + flag) >= 10){
                str.append(sum + flag - 10);
                flag = 1;
            }
            else{
                str.append(sum + flag);
                flag = 0;
            }
        }
        if(flag == 1) str.append("1");
        return str.reverse().toString();

    }

}
