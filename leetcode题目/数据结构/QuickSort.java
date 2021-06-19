package leetcode题目.数据结构;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(8000);
        }
        new QuickSort().QuickSort(nums,0,9);
        for (int s : nums) {
            System.out.print(s+" ");
        }


    }
    public  void QuickSort(int[] nums, int left, int right){
        if (left<right) {
            int pivot=zhongzhi(nums, left, right);
            int i=left,j=right-1;
            while (i!=j) {
                while (i<j&&nums[i] <= pivot) i++;
                nums[j]=nums[i];
                while (j>i&&nums[j] >= pivot) j--;
                nums[i]=nums[j];
            }
            nums[i]=pivot;
            QuickSort(nums,left,i-1);
            QuickSort(nums,j+1,right);
        }

    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int zhongzhi(int[] nums,int i,int j){
        int m=(i+j)/2;
        if (nums[i] > nums[m]) swap(nums, i, m);   //三步确认从小到大排序
        if (nums[m] > nums[j]) swap(nums, m, j);
        if (nums[i] > nums[m]) swap(nums, i, m);
        swap(nums,m,j-1); //置于倒数第二个元素，保证其右边有值
        return nums[j-1];
    }
}
