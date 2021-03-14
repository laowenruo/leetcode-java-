package leetcode题目;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class leetcode503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n*2; i++){
            int num = nums[i % n];
            while(!stack.isEmpty() && num > nums[stack.peek()]){
                res[stack.pop()] = num;
            }
            if(i < n) stack.add(i);
        }
        return res;
    }
    @Test
    public void test(){
        nextGreaterElements(new int[]{1,2,1});
    }
}
