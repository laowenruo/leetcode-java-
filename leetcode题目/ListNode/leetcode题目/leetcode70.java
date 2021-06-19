package leetcode题目.ListNode.leetcode题目;

public class leetcode70 {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int j = 1;
        int k = 2;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = j + k;
            j = k;
            k = temp;
        }
        return temp;
    }
    public static int climbStairs1(int n) {
        if (n<=2){
            return n;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }


}
