package leetcode.ListNode1.leetcode题目;

public class leetcode33 {
    class Solution {
        public int search(int[] nums, int target) {
            int left=0,right= nums.length-1;
            while (left<right){
                int mid=(left+right)/2;
                if (nums[mid]==target){
                    return mid;
                }
                if (nums[mid]>=nums[left]){
                    if (target>=nums[left]&&target<nums[mid]){
                        right=mid-1;
                    }
                    else {
                        left=mid+1;
                    }
                }
                else {
                    if (target>nums[mid]&&target<=nums[right]){
                        left=mid+1;
                    }
                    else {
                        right=mid-1;
                    }
                }
            }
            if (nums[left]==target){
                return left;
            }
            return -1;
        }
    }
}
