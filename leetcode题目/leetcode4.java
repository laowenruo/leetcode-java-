package leetcode题目;

import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int length=n+m;
        boolean flag=length%2==0;
        int[] nums=new int[length];
        int i=0,j=0,index=0;
        while (i<n&&j<m){
            if (nums1[i]<=nums2[j]){
                nums[index++]=nums1[i++];
            }
            else {
                nums[index++]=nums2[j++];
            }
            if (index>length/2){
                return flag?(double)((nums[index]+nums[index-1])/2):(double)nums[index];
            }
        }
        while (i==n&&j!=m){
            nums[index++]=nums2[j++];
            if (index>length/2){
                return flag?(double)((nums[index]+nums[index-1])/2):(double)nums[index];
            }
        }
        while (i!=m&&j!=n){
            nums[index++]=nums2[i++];
            if (index>length/2){
                return flag?(double)((nums[index]+nums[index-1])/2):(double)nums[index];
            }
        }
        return 0.00000;
    }
}
