package 剑指offer;

import java.util.ArrayList;

public class offer59 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int length= nums.length;
            int max=Integer.MIN_VALUE;
            int[] result=new int[length-k+1];
            if (length==0||k==1) return nums; //测试用例真坑，还有长度为0....
            for (int i=0;i<k;i++){      //第一次扫描K长度并且保存最大值，往后下标开始从K直到末尾扫描
                if (nums[i]>max) max=nums[i];
            }
            int temp=1;  //循环从K开始，故设计数器为数组下标
            result[0]=max;
            for (int i=k;i<length;i++){
                if (nums[i-k]==max) {   //如果移动掉的元素是最大值，则重新扫描一次得到最大值
                    max=nums[i-k+1];
                    for (int j=i-k+1;j<i-k+1+k;j++)
                        if (nums[j]>max) max=nums[j];
                }
                if (nums[i]>max)  max=nums[i];  //如果新添加进来的元素比最大值大，交换
                result[temp++]=max;
            }
            return result;
        }
    }
}
