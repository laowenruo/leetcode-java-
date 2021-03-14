package leetcode题目;

public class leetcode303 {
    private int[] nums;
    public leetcode303(int[] nums) {
        this.nums=nums;
    }

    public int sumRange(int i, int j) {
        int sum=0;
        for (;i<=j;i++) sum+=nums[i];
        return sum;
    }
}
