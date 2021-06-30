package leetcode;

public class leetcode1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 获取两个串字符
                char c1 = text1.charAt(i), c2 = text2.charAt(j);
                if (c1 == c2) {
                    // 去找它们前面各退一格的值加1即可
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    //要么是text1往前退一格，要么是text2往前退一格，两个的最大值
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[m][n];
    }
    public int longestCommonSubsequence1(String text1, String text2){
        if (text1==null||text2==null){
            return 0;
        }
        char[] chars = text1.toCharArray();
        char[] chars1 = text2.toCharArray();
        int n= chars.length;
        int m= chars1.length;
        int[][] dp=new int[n+1][m+1];
        int max=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (chars[i-1]==chars[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
                max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}
