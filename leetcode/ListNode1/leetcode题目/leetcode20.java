package leetcode.ListNode1.leetcode题目;

import java.util.Stack;

public class leetcode20 {

    public boolean isValid(String s) {
            Stack<Character> stack=new Stack<>();
            char[] str=s.toCharArray();
            for (int i=0;i<str.length;i++){
                switch (str[i]){
                    case ']':if (stack.size()!=0&&stack.peek()=='[') stack.pop();else stack.push(str[i]);break;
                    case '}':if (stack.size()!=0&&stack.peek()=='{') stack.pop();else stack.push(str[i]);break;
                    case ')':if (stack.size()!=0&&stack.peek()=='(') stack.pop();else stack.push(str[i]);break;
                    default:stack.push(str[i]);
                }
            }
            if (stack.size()==0) return true;
            return false;
    }

    public static void main(String[] args) {
        System.out.println(new leetcode20().isValid("]))"));
    }
}
