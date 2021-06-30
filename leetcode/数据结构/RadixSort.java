package leetcode.数据结构;

import java.util.Random;

public class RadixSort {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(80);
        }
        new RadixSort().sort(nums);
        //排序代码
        for (int s : nums) {
            System.out.print(s+" ");
        }
    }
    public void sort(int[] nums){
        int[][] bucket=new int[10][nums.length];
        int[]  number=new int[10];//存放数量
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if (nums[i]>max) max=nums[i];
        }
        int maxlength=(max+"").length();
        for (int n=0,i=1;n<maxlength;i*=10,n++){

            for (int j=0;j<nums.length;j++){
                int temp=nums[j]/i%10;
                bucket[temp][number[temp]]=nums[j];
                number[temp]++;
            }
            for (int j=0,k=0;j< number.length;j++){
                if (number[j]!=0) {
                    for (int i1 = 0; i1 < number[j]; i1++)
                        nums[k++] = bucket[j][i1];
                }
                 number[j]=0;
            }

        }
    }
}
