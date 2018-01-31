package com.Algorithm.LeetCode.Simple;

public class IslandPerimeter {
    public static void main(String[] args)
    {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid)
    {
        int perimeter = 0;
        for(int i = 0; i < grid.length; i ++)
        {
            int[] row = grid[i];
            for(int j = 0; j < row.length; j++)
            {
                if(row[j] == 1)
                {
                    if(i == 0 || grid[i - 1].length < (j+1) || grid[i - 1][j] == 0) perimeter++;
                    if(i == grid.length - 1 || grid[i + 1].length < (j+1) || grid[i + 1][j] == 0) perimeter++;
                    if(j == 0 || row[j -1] == 0) perimeter++;
                    if(j == row.length -1 || row[j + 1] == 0)perimeter ++;
                }
            }
        }
        return  perimeter;
    }
}
