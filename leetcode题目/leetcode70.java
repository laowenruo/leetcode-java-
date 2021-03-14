package leetcode题目;

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


}
