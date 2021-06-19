package leetcode题目.剑指offer;

import java.util.ArrayList;

public class offer57_A {
    public int[] twoSum1(int[] nums, int target) {       //超时，测试用例太长，老子吐了
     int[] result=new int[2];
     ArrayList<Integer> arrayList=new ArrayList<>();
     for (int i=0;i<nums.length;i++){
         if (arrayList.contains(target-nums[i])){
             result[0]=target-nums[i];
             result[1]=nums[i];
             return result;
         }
         else arrayList.add(nums[i]);
     }
     return result;
    }
    public int[] twoSum(int[] nums, int target){  //双指针
            int j=nums.length-1;
            int[] result=new int[2];
            for (int i=0;i<nums.length;)
            {
                if (nums[i]+nums[j]>target) j--;
                else if (nums[i]+nums[j]<target) i++;
                else {
                    result[0]=nums[i];
                    result[1]=nums[j];
                    return result;
                }
            }
            return result;
    }
}
