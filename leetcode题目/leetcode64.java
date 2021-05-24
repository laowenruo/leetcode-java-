package leetcode题目;

import org.junit.Test;

public class leetcode64 {
    class Solution {
        int min=Integer.MAX_VALUE;
        public int minPathSum(int[][] grid) {
            dfs(0,0,grid,0);
            return min;
        }
        public void dfs(int i,int j,int[][] grid,int sum){
            if (i>= grid.length||j>=grid[0].length){
                return;
            }
            if (i== grid.length-1&&j== grid[0].length-1){
                sum=sum+grid[i][j];
                min=sum<min?sum:min;
                return;
            }
            sum=sum+grid[i][j];
            dfs(i+1,j,grid,sum);
            dfs(i,j+1,grid,sum);
        }
        public int minPathSum1(int[][] grid){
            int n= grid.length;
            int m= grid[0].length;
            int[][] dp=new int[n+1][m+1];
            for (int j=1;j<=m;j++){
                dp[1][j]=dp[1][j-1]+grid[0][j-1];
            }
            for (int i=1;i<=n;i++){
                dp[i][1]=dp[i-1][1]+grid[i-1][0];
            }
            for (int i=2;i<=n;i++){
                for (int j=2;j<=m;j++){
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i-1][j-1];
                }
            }
            return dp[n][m];
        }
    }
    @Test
    public void test(){
        new Solution().minPathSum1(new int[][]{{1,2},{1,1}});
    }
}
