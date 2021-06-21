package leetcode.ListNode1.leetcode题目;

public class leetcode283 {
    public void moveZeroes(int[] nums) {
        int temp=0;
        if(nums.length<=1||nums==null) return;
        for (int i=0;i< nums.length;i++){
                    if (nums[i]!=0) nums[temp++]=nums[i];
                    else {
                        continue;
                    }
    }
        for (int i=temp;i<nums.length;i++) nums[i]=0;
    }
}
