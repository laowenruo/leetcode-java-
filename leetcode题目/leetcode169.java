package leetcode题目;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

public class leetcode169 {
    class Solution {
        public int majorityElement(int[] nums) {
            int temp=1;//维护最大出现次数
            int max=0; //维护最大值
            HashMap<Integer,Integer> hashMap=new HashMap<>();
            if (nums.length==1) return nums[0];
            for (int i=0;i< nums.length;i++){
                if (!hashMap.containsKey(nums[i])){
                    hashMap.put(nums[i],1);
                }
                else {
                    hashMap.put(nums[i],hashMap.get(nums[i])+1);
                    if (temp<hashMap.get(nums[i])+1) {temp=hashMap.get(nums[i])+1; max=nums[i];}
                }

            }
            return max;
        }
        public int majorityElement1(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
        public int majorityElement2(int[] nums){
            Deque<Integer> stack=new ArrayDeque<>();
            for (int i=0;i< nums.length;i++){
                if (!stack.isEmpty()&&nums[i]!=stack.peek()){
                    stack.pop();
                    continue;
                }
                else {
                    stack.push(nums[i]);
                }
            }
            return stack.peek();
        }
    }
}
