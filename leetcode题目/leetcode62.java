package leetcode题目;

import org.junit.Test;

public class leetcode62 {
    public int count;
    public int uniquePaths(int m, int n) {
        int[][] num=new int[m][n];
        dfs(num,0,0);
        return count;
    }
    public void dfs(int[][] num,int i,int j){
        //i代表行，j代表列,边界条件
        if (i==num.length-1&&j==num[0].length-1){
            count++;
        }
        if (i>= num.length||j>=num[0].length) {
            return;
        }
        if (num[i][j]==1) {
            return;
        }
        num[i][j]=0;
        dfs(num,i,j+1);
        dfs(num,i+1,j);
    }
    @Test
    public void test(){
        System.out.println(uniquePaths(23, 12));
    }
}
