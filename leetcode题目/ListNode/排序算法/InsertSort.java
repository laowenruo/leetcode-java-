package leetcode题目.ListNode.排序算法;

import org.junit.Test;

public class InsertSort {
    public int[] insertSort(int[] nums){
      int n= nums.length;
      for (int i=1;i<n;i++){
          int temp=nums[i];
          int k=i-1;
          while (k>0&&nums[k]>temp){
              nums[k+1]=nums[k];
              k--;
          }
          nums[k+1]=temp;
      }
      return nums;
    }
    @Test
    public void test(){
        int[] nums=new int[]{1,5,7,2,1,5,7,4,6};
        for (int i : insertSort(nums)) {
            System.out.println(i);
        }
    }
}
