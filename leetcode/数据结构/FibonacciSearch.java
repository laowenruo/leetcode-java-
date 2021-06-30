package leetcode.数据结构;

import java.util.Arrays;

public class FibonacciSearch {
    public static void main(String[] args) {  //默认数组长度大于2
        int i = new FibonacciSearch().fibonacciSearch(0, 9, new int[]{1,2,3,4,5,6,7,8,9,10}, 9);
        System.out.println(i);
    }
    public static int[] fibonarcci(int maxsize){
        int[] result=new int[maxsize];
        result[0]=1;
        result[1]=1;
        for (int k = 2; result[k-1] <= maxsize; k++) {
            result[k]=result[k-1]+result[k-2];
        }
        return result;
    }
    private int fibonacciSearch(int low, int high, int[] nums, int target) {
        int mid;
        int k=0;//默认斐波那契下标
        int f[]=fibonarcci(high+1);
        while ((high+1)>f[k]) k++;
        int[] temp= Arrays.copyOf(nums,f[k]);
        for (int i=high;i<temp.length;i++) temp[i]=nums[high];
        while (low<=high){
            mid=low+f[k-1]-1;
            if (target>temp[mid]) {
                low=mid+1;
                k--;
            }
            else if (target==temp[mid]) {if (mid>=high)return high; else return mid;}
            else {
                high=mid-1;
                k--;
            }
        }
        return -1;
    }
}
