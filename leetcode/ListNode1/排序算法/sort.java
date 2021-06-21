package leetcode.ListNode1.排序算法;

import org.junit.Test;

public class sort {
    public void partition(int[] nums,int left,int right){
//        if (left<right){
//            int pivot=sort(nums,left,right);
//            sort(nums,left,pivot-1);
//            sort(nums,pivot+1,right);
//        }
    }
    public void sort(int[] nums){
        int size= nums.length;
        int[][] results=new int[10][size];

    }
    public int youhua(int[] nums,int left,int right){
        int mid=(left+right)/2;
        if (nums[left]>nums[mid]) swap(nums,left,mid);
        if (nums[mid]>nums[right]) swap(nums,mid,right);
        if (nums[left]>nums[mid]) swap(nums,left,mid);
        swap(nums,mid,right-1);
        return right-1;
    }
    public void heapTop(int[] nums,int i,int size){
        int left=2*i;
        int right=2*i+1;
        int largest=i;
        if (left<size&&nums[largest]<nums[left]){
            largest=left;
        }
        if (right<size&&nums[largest]<nums[right]){
            largest=right;
        }
        if (largest!=i){
            swap(nums,i,largest);
            heapTop(nums,largest,size);
        }
    }
    public void swap(int[] nums,int i ,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    @Test
    public void test(){
        int[] nums=new int[]{1, 24, 5, 2, 21, 5, 61};
        sort(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
