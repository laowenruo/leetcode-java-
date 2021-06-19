package leetcode题目.ListNode.排序算法;

import org.junit.Test;

public class shellsort {
    public void shell(int[] nums) {
        int n = nums.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int preindex = i - gap;
                int temp = nums[i];
                while (preindex > 0 && nums[preindex] > temp) {
                    nums[preindex + gap] = nums[preindex];
                    preindex = preindex - gap;
                }
                nums[preindex + gap] = temp;
            }
            gap = gap / 2;
        }
    }
    @Test
    public void test(){
        int[] nums=new int[]{1,5,7,2,1,5,7,4,6};
        shell(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
