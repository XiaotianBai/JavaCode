package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args)
    {
        int[][] nums = {{1,2,3}, {4,5,6}};
        int[][] matrix = matrixReshape(nums, 3, 2);
        for(int []num : matrix)
        System.out.print(Arrays.toString(num));
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c)
    {
        int[][] matrix = new int[r][c];
        if(r <= 0 || c <= 0) return nums;
        ArrayList<Integer> elements = new ArrayList<>();
        for(int[] row : nums)
        {
            for(int num : row) elements.add(num);
        }
        int size = elements.size();
        if(size == 0 || (size % (r*c)) != 0) return nums;
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                matrix[i][j] = elements.get(c * i + j);
            }
        }
        return matrix;

    }
}
