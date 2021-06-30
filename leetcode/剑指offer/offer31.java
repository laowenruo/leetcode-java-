package leetcode.剑指offer;

import java.util.Stack;

//[1,2,3,4,5]
//        [4,5,3,2,1]
//        [1,2,3,5]
//        [3,5,1,2]
public class offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {  //本地无错，leetcode提交越界不知道为什么
        Stack<Integer> stack=new Stack();
        int i=0,j=0;
        while (i< pushed.length) {
            if (i < pushed.length) while (pushed[i] != popped[j]) stack.push(pushed[i++]);
            while (i < pushed.length && j < popped.length&&pushed[i] == popped[j] ) {
                i++;
                j++;
            }
            while (j < popped.length && stack.size()!=0&&stack.peek() == popped[j++]) stack.pop();
            if (i == pushed.length && j != popped.length) return false;
        }
        return true;
    }
}
//class Solution {
//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        int N = pushed.length;
//        Stack<Integer> stack = new Stack();
//
//        int j = 0;
//        for (int x: pushed) {
//            stack.push(x);
//            while (!stack.isEmpty() && j < N && stack.peek() == popped[j]) {
//                stack.pop();
//                j++;
//            }
//        }
//
//        return j == N;
//    }
//}

