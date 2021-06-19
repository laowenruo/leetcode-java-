package leetcode题目.剑指offer;

public class offer47 {
    public int maxValue(int[][] grid) {
        int n= grid.length;//行
        int m=grid[0].length;//列
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++){
                if (i==0&&j==0) continue;
                if (i==0) grid[i][j]+=grid[i][j-1];
                else if (j==0) grid[i][j]+=grid[i-1][j];
                else grid[i][j]+=Math.max(grid[i-1][j],grid[i][j-1]);
            }
        return grid[n-1][m-1];
    }
}
