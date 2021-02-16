import java.util.*;

public class leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        // 初始化low = 0, high = nums.length - 1
        int temp=helper(nums, target, 0, nums.length - 1);
        if (nums.length==0||temp==-1) return new int[]{-1,-1};
        if (nums.length==1) return new int[]{0,0};
        int[] sum=new int[2];
        int i=temp,j=temp;
        while(i>=0&&nums[i]==target) i--;
        while(j<=nums.length-1&&nums[j]==target) j++;
        sum[0]=i+1;
        sum[1]=j-1;
        return sum;
    }

    // 根据算法设计分3种情况
    public int helper(int[] nums, int target, int low, int high) {
        if (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return helper(nums, target, low, mid - 1);
            } else {
                return helper(nums, target, mid + 1, high);
            }
        }
        return -1;
    }

}
