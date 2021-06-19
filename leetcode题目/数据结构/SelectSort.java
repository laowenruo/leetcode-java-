package leetcode题目.数据结构;

import java.util.Random;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums=new int[800];
        Random random=new Random();
        int temp;
        for (int i = 0; i < nums.length; i++) {
            nums[i]= random.nextInt(8000);
        }
        for (int i=0;i<nums.length;i++) {
            temp=i;
            for (int j = temp+1; j < nums.length; j++) {
                if (nums[j] < nums[temp]) temp=j;
            }
            if (temp!=i) {
                int num=nums[i];
                nums[i]=nums[temp];
                nums[temp] =num;
            }
        }
        for (int s : nums) {
            System.out.print(s+" ");
        }
    }
}
