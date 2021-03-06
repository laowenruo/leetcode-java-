package leetcode.数据结构;

import java.util.Random;

public class InsertValueSort {
    public static void main(String[] args) {
        int[] nums=new int[100];
        int[] temp = new int[nums.length];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(800);
        }
        new BinarySearch().mergeSort(nums,0, nums.length-1,temp);
        int i = new InsertValueSort().InsertValueSearch(0, 9, new int[]{1,2,3,4,5,6,7,8,9,10}, 9);
        System.out.println(i);
    }
    public int InsertValueSearch(int left,int right,int[] nums,int target){
        if (left>right||nums[left]>target||nums[right]<target) return -1;
        int mid=left+(target-nums[left])/(nums[right]-nums[left])*(right-left);
        if (nums[mid]==target) return mid;
        else if (nums[mid]>target) return InsertValueSearch(left,mid-1,nums,target);
        else return InsertValueSearch(mid+1,right,nums,target);
    }
    public void mergeSort(int[] nums,int left,int right,int[] temp){
        if (left>=right) return;
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid, temp);
        mergeSort(nums, mid+1, right, temp);
        merge(nums, left,mid,right, temp);
    }
    public void merge(int[] nums,int left,int mid,int right,int[] temp){
        int m=left;
        int i=left;
        int j=mid+1;
        while (i<=mid&&j<=right){
            if (nums[i]<=nums[j]) temp[m++]=nums[i++];
            else temp[m++]=nums[j++];
        }
        while (j<=right) temp[m++]=nums[j++];
        while (i<=mid)   temp[m++]=nums[i++];
        for (int i1 = left; i1 <= right; i1++) {
            nums[left++]=temp[i1];
        }
    }
}
