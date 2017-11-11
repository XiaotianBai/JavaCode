package Algorithm.LeetCode;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0}, {0,0,1,0,0,0,0,1,0,0,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] grid)
    {
        int max = 0;
        int area = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == 1)
                    area = maxAreaHelper(grid,i, j );
                if(area > max) max = area;
            }
        }
        return max;
    }

    private static int maxAreaHelper(int[][] grid, int i, int j)
    {
        int area = 1;
        grid[i][j] = 0;
        if(i < (grid.length -1) && grid[i + 1][j] == 1) area += maxAreaHelper(grid, i+1, j);
        if(i > 0 && grid[i - 1][j] == 1) area += maxAreaHelper(grid, i-1, j);

        if (j < (grid[i].length -1) &&grid[i][j+1] == 1) area += maxAreaHelper(grid, i, j+1);
        if (j > 0 &&grid[i][j-1] == 1) area += maxAreaHelper(grid, i, j-1);
        return area;
    }
}
