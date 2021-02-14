import java.util.Stack;

public class leetcode155 {
    class MinStack {

        private int min = Integer.MAX_VALUE;
        private Stack<Integer> stack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
        }
        public void push(int x) {
            if(min >= x){
                stack.push(min);
                min = x;
            }
            stack.push(x);
        }

        public void pop() {
            if(stack.pop() == min){
                min = stack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }
}
