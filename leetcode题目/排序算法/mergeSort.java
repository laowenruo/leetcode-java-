package leetcode题目.排序算法;

import org.junit.Test;

public class mergeSort {
    int[] nums=new int[]{1,5,7,2,1,5,7,4,6};
    int[] temp=new int[nums.length];
    public void divide(int nums[],int begin,int end){
        if (begin<end) {
            int mid = (begin + end) / 2;
            divide(nums, begin, mid);
            divide(nums, mid+1, end);
            merge(nums, begin,mid, end);
        }
    }

    private void merge(int[] nums, int begin,int mid, int end) {
        int count=0;
        int index=begin;
        int j=begin,k=mid+1;
        while (true){
            while (j<=mid&&k<=end){
                if (nums[j]>nums[k]) temp[count++]=nums[k++];
                else temp[count++]=nums[j++];
            }
            while (j<=mid) temp[count++]=nums[j++];
            while (k<=end) temp[count++]=nums[k++];
            break;
        }
        for (int i=0;i< count;i++) nums[index++]=temp[i];
    }
    @Test
    public void test(){
        divide(nums,0,8);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
