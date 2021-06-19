package leetcode题目.ListNode.leetcode题目;

public class leetcode718 {
    public int findLength(int[] A, int[] B) {
        int n=A.length;
        int m=B.length;
        int[][] dp=new int[n+1][m+1];
        int max=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (A[i]==B[j]){
                    dp[i+1][j+1]=dp[i][j]+1;
                }
                max=Math.max(dp[i+1][j+1],max);
            }
        }
        return max;
    }
}
