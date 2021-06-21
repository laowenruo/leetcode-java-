package leetcode.ListNode1.leetcode题目;

public class leetcode153 {
    class Solution {
        public int findMin(int[] nums) {
            int i=0;
            int j=nums.length-1;
            while (i<j){
                int middle=(i+j)/2;
                if (nums[middle]>nums[j]){
                    i=middle+1;
                }
                else if (nums[middle]<nums[j]){
                    j=middle;
                }
            }
            return nums[i];
        }
    }
}
