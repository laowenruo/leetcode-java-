package leetcode题目;

import java.util.Arrays;

public class leetcode31 {
    class Solution {
        public void nextPermutation(int[] nums) {
            for (int i= nums.length-1;i>0;i--) {
                if (nums[i]>nums[i-1]){
                    Arrays.sort(nums,i,nums.length);
                    for (int j=i;j< nums.length;j++){
                        if (nums[j]>nums[i-1]){
                            swap(nums,i-1,j);
                            return;
                        }
                    }
                }
            }
            Arrays.sort(nums);
            return;
        }
        public void swap(int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
