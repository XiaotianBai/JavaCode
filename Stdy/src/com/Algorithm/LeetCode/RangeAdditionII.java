package com.Algorithm.LeetCode;

public class RangeAdditionII {
    public static void main(String[] args)
    {
        int m = 3, n = 3;
        int[][] ops = {{2,2},{3,3}};
        System.out.println(maxCount(m,n,ops));
    }

    public static int maxCount(int m, int n, int[][] ops)
    {
        if(m == 1 && n == 1) return 1;
        int rowCount = m;
        int columnCount = n;
        for(int[] op : ops )
        {
            if(op[0] < rowCount ) rowCount = op[0];
            if(op[1] < columnCount) columnCount = op [1];
        }
        return rowCount * columnCount;
    }
}
