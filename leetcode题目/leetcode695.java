package leetcode题目;

public class leetcode695 {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length==0||grid[0].length==0) {
            return 0;
        }
        int max=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]==1) {
                    max = Math.max(dfs(grid, i, j), max);
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i,int j){
        if (!(i>=0&&j>=0&&i<grid.length&&j<grid[0].length)) {
            return 0;
        }
        if (grid[i][j]!=1){
            return 0;
        }
        else {
            grid[i][j]=2;
        }
        return 1+dfs(grid,i+1,j)+dfs(grid,i,j+1)+dfs(grid,i-1,j)+dfs(grid,i,j-1);
    }
}
