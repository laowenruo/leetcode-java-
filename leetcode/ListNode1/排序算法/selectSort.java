package leetcode.ListNode1.排序算法;

import org.junit.Test;

public class selectSort {
    public void swap(int[] nums,int i,int j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    public int[] SelectSort(int[] nums){  //降序
        int length=nums.length;
        int min=0;
        for (int i=0;i<length;i++){
            min=i;
            for (int j=i+1;j<length;j++)
            {
                if (nums[min]<nums[j]) min=j;
            }
            swap(nums,min,i);
        }
        return nums;
    }
    public int[] SelectSort1(int[] nums){  //升序
        int length=nums.length;
        int max=length-1;
        for (int i=length-1;i>0;i--){
            max=i;
            for (int j=i-1;j>0;j--)
            {
                if (nums[max]<nums[j]) max=j;
            }
            swap(nums,max,i);
        }
        return nums;
    }
    public int[] SelectSort2(int[] nums){  //升序
        int length=nums.length;
        int max=length-1;
        for (int i=0;i<length;i++){
            max=length-i-1;
            for (int j=0;j<length-i;j++)
            {
                if (nums[max]<nums[j]) max=j;
            }
            swap(nums,max,length-i-1);
        }
        return nums;
    }
    @Test
    public void test(){
        int[] nums=new int[]{1,5,7,2,1,5,7,4,6};
        for (int i : SelectSort2(nums)) {
            System.out.println(i);
        }
    }
}
