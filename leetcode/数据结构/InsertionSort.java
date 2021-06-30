package leetcode.数据结构;

import org.junit.Test;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = new int[800];
        Random random = new Random();
        int i,j;
        for (i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(8000);
        }
        for (i=0;i< nums.length;i++){
            int temp=nums[i];
            for (j=i-1;j>=0;j--){
                if (temp>nums[j]) break;
                else nums[j+1]=nums[j];
            }
            nums[j+1]=temp;
        }
        for (int s : nums) {
            System.out.print(s+" ");
        }
    }
    @Test
    public void test(){
        int[] nums = new int[800];
        Random random = new Random();
        int i,j;
        for (i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(8000);
        }
        for (i=0;i< nums.length;i++){
          int index=i-1;
          int temp=nums[i];
          while (index>=0&&temp<nums[index]){
              nums[index+1]=nums[index];
              index--;
          }
          nums[index+1]=temp;
        }
        for (int s : nums) {
            System.out.print(s+" ");
        }
    }
}
