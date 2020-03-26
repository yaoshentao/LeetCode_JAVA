package cn.ques892;

public class Solution {
    public int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 0) continue;
                sum += 6 + (grid[i][j] -1) * 4;
                if(i>0&&grid[i-1][j]!=0) sum -= (grid[i-1][j]>grid[i][j]?grid[i][j]:grid[i-1][j]);
                if(i+1<grid.length&&grid[i+1][j]!=0) sum -= (grid[i+1][j]>grid[i][j]?grid[i][j]:grid[i+1][j]);
                if(j>0&&grid[i][j-1]!=0) sum -= (grid[i][j-1]>grid[i][j]?grid[i][j]:grid[i][j-1]);
                if(j+1<grid[i].length&&grid[i][j+1]!=0) sum -= (grid[i][j+1]>grid[i][j]?grid[i][j]:grid[i][j+1]);
            }
        }
        return sum;
    }
}


