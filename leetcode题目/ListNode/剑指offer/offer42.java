package leetcode题目.ListNode.剑指offer;

public class offer42 {
    public int maxSubArray(int[] nums) {
     int max=Integer.MIN_VALUE;
     int sum=0;
     for (int i=0;i< nums.length;i++){
         sum+=nums[i];
         max=sum>max?sum:max;
         if (sum<0) sum=0;
     }
     return max;
    }
}
