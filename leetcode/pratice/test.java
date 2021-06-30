package leetcode.pratice;

class Solution {
    public int numIslands(char[][] grid) {
        int num=0;
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[0].length; i1++) {
                if (grid[i][i1]=='1'){
                    dfs(grid,i,i1);
                    num++;
                }
            }
        }
        return num;
    }
    public void dfs(char[][] grid,int i,int j){
        if (grid[i][j]=='0'||grid[i][j]=='2'||i<0||j<0||i>grid.length||j>grid[0].length){
            return;
        }
        grid[i][j]='2';
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
    }
}