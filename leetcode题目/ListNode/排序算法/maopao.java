package leetcode题目.ListNode.排序算法;

import org.junit.Test;

public class maopao {
    public int[] MaoPao(int[] nums){
        int length= nums.length;
        int count=0;
        boolean flag=true;
        for (int i=0;i<length-1;i++,count++){
            for (int j=0;j<length-1-count;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=false;
                }
            }
            if (flag) break;
        }
        return nums;
    }
    @Test
    public void test(){
        int[] nums=new int[]{1,5,7,2,1,5,7,4,6};
        for (int i : MaoPao(nums)) {
            System.out.println(i);
        }
    }
}
