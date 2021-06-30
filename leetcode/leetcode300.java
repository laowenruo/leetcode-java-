package leetcode;

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
    public static int lengthOfLIS1(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int n=nums.length;
        int[] dp=new int[n];
        int max=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                if (nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j+1]);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    @Test
    public void test(){
        System.out.println(lengthOfLIS(new int[]{4,10,4,3,8,9}));
    }
}
