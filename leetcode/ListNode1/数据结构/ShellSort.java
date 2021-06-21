package leetcode.ListNode1.数据结构;

import java.util.Random;

public class ShellSort {
    public static void main(String[] args) {
        int[] nums = new int[8000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(8000);
        }
        for (int step = nums.length / 2; step > 0; step /= 2) {
            for (int i = step; i < nums.length; i++) {
                int j = i;
                int temp = nums[j];
                if (nums[j-step]>temp){
                while (j - step >= 0 && nums[j - step] > temp) {
                    nums[j] = nums[j - step];
                    j = j - step;
                }
                nums[j] = temp;
            }
            }
        }
        for (int s : nums) {
            System.out.print(s + " ");
        }
    }
}

