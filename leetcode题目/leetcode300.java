package leetcode题目;

import org.junit.Test;

import java.util.Arrays;
public class leetcode300 {
    public static int lengthOfLIS(int[] nums) {
            if(nums.length == 0) {
                return 0;
            }
            int[] dp = new int[nums.length];
            int res = 0;
            Arrays.fill(dp, 1);
            for(int i = 0; i < nums.length; i++) {
                for(int j = 0; j < i; j++) {
                    if(nums[j] < nums[i]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                res = Math.max(res, dp[i]);
            }
            return res;
        }
    @Test
    public void test(){
        System.out.println(lengthOfLIS(new int[]{4,10,4,3,8,9}));
    }
}
