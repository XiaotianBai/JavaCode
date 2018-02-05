package com.Algorithm.LeetCode.Simple;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args){
        List<List<Integer>> ans = generate(5);
        System.out.print(ans.get(4));
    }

    private static List<List<Integer>> generate(int numRows){
        List<List<Integer>> res= new ArrayList<>();
        if(numRows == 0) return res;
        List<Integer> r1 = new ArrayList<>();
        r1.add(1);
        res.add(r1);
        if(numRows == 1 )return res;
        List<Integer> r2 = new ArrayList<>();
        r2.add(1);
        r2.add(1);
        res.add(r2);
        if(numRows == 2 )return res;
        List<Integer> r3 = new ArrayList<>();
        r3.add(1);
        r3.add(2);
        r3.add(1);
        res.add(r3);
        if(numRows == 3 )return res;
        int curRow = 4;
        while(curRow <= numRows){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            int i = 0;
            while(i < curRow - 2){
                temp.add(res.get(curRow - 2).get(i) + res.get(curRow - 2).get(i + 1));
                i ++;
            }
            temp.add(1);
            res.add(temp);
            curRow++;
        }
        return res;
    }
}
