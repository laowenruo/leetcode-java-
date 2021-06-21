package leetcode.ListNode1.剑指offer;

import java.util.Arrays;

public class offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
      if (k==0||arr.length==0) return new int[0];
      return quickSearch(arr,0,arr.length-1,k-1);
    }

    private int[] quickSearch(int[] arr, int begin, int end, int k) {
        int j=partition(arr,begin,end);
        if (j==k) return Arrays.copyOf(arr,j+1);
        return j>k?quickSearch(arr,begin,j-1,k):quickSearch(arr, j + 1, end, k);
    }

    private int partition(int[] nums, int lo, int hi) {
        int v = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (++i <= hi && nums[i] < v);
            while (--j >= lo && nums[j] > v);
            if (i >= j) {
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }
}
