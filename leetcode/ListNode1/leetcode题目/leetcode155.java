package leetcode.ListNode1.leetcode题目;

import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode155 {
    class MinStack {
        Deque<Integer> stack;
        int min=Integer.MAX_VALUE;
        /** initialize your data structure here. */
        public MinStack() {
            stack=new ArrayDeque<>();
        }

        public void push(int val) {
            if (min>val){
                stack.push(min);
                min=val;
            }
            stack.push(val);
        }

        public void pop() {
            Integer pop = stack.pop();
            if (pop==min){
                min=stack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
