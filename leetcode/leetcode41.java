package leetcode;

public class leetcode41 {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            partition(nums,0, nums.length-1);
            int index=1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]<=0||i>0&&nums[i]==nums[i-1]){
                    continue;
                }
                else {
                    if (nums[i]!=index){
                        break;
                    }else {
                        index++;
                    }
                }
            }
            return index;
        }
        public void partition(int[] nums,int begin,int end){
            if (begin>=end){
                return;
            }
            int target=nums[end];
            int i=begin,j=end;
            while (i<j){
                while (i<j&&nums[i]<=target){
                    i++;
                }
                nums[j]=nums[i];
                while (i<j&&nums[j]>target){
                    j--;
                }
                nums[i]=nums[j];
            }
            nums[i]=target;
            partition(nums,begin,i-1);
            partition(nums,i+1,end);
        }
    }
}
