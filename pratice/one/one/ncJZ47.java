package pratice.one.one;

import java.util.*;

public class ncJZ47 {
    public int getMost(int[][] board) {
        if (board==null||board.length==0||board[0].length==0){
            return 0;
        }
        int max=0;
        int[][] dp=new int[board.length+1][board[0].length+1];
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+board[i-1][j-1];
                max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}