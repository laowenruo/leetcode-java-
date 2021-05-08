package leetcode题目;

public class leetcode5 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int maxBegin=0;
        int maxEnd=0;
        int count=0;
        int max=0;
        for (int i=0;i< chars.length;i++){
            int n=i-1;
            int m=i+1;
            count=0;
            while (n>=0&&chars[n]==chars[i]){
                count++;
                n--;
            }
            while (m< chars.length&&chars[m]==chars[i]){
                count++;
                m++;
            }
            while (n>=0&&m<chars.length&&chars[n]==chars[m]){
                n--;
                m++;
                count=count+2;
            }
            if (count>max){
                maxBegin=n+1;
                maxEnd=m-1;
                max=count;
            }
        }
        return s.substring(maxBegin,maxEnd+1);
    }
    public String longestPalindrome1(String s) {
        if (s==null||s.length()<2){
            return s;
        }
        int strLen=s.length();
        char[] chars = s.toCharArray();
        boolean[][] dp=new boolean[strLen][strLen];
        int maxBegin = 0,maxEnd = 0;
        int count=1;
        for (int i=1;i<strLen;i++){
            for (int j=0;j<i;j++){
                if (chars[i]==chars[j]&&(i-j<=2||dp[i+1][j-1])){
                    dp[i][j]=true;
                    int temp=i-j+1;
                    if (temp>count){
                        count=temp;
                        maxBegin=i;
                        maxEnd=j;
                    }
                }
            }
        }
        return s.substring(maxBegin,maxEnd+1);
    }
}
