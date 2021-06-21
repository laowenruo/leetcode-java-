package leetcode;

public class leetcode53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            if (nums.length==1) return nums[0];
            int max=nums[0];
            int sum=0;
            for (int i=0;i< nums.length;i++){
               if (sum>0) sum+=nums[i];
               else {
                   sum=nums[i];
               }
               max=Math.max(max,sum);
            }
            return max;
        }
    }
}
