package leetcode.ListNode1.leetcode题目;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class leetcode503 {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<2*n;i++){
            int num=nums[i%n];
            while (!stack.isEmpty()&&nums[i]>nums[stack.peek()]){
                res[stack.pop()]=nums[i];
            }
            if (i<n){
                stack.push(i);
            }
        }
        return res;
    }
    @Test
    public void test(){
        for (int i : nextGreaterElements(new int[]{1, 2, 1})) {
            System.out.println(i);
        }
    }
}
