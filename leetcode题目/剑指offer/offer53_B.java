package leetcode题目.剑指offer;

public class offer53_B {
    public int missingNumber(int[] nums) {
     if (nums.length==1) return 1-nums[0];
     for (int i=1;i<nums.length;i++){
         if (nums[i]-nums[i-1]==1) continue;
         else return nums[i-1]+1;
     }
     int sum=0;
     for (int i=0;i<nums.length;i++)
         sum+=nums[i];
     int temp=((nums.length)*(nums.length+1))/2;
     return  temp-sum;
    }
}
