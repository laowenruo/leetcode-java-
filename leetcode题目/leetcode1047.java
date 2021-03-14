package leetcode题目;

import java.util.Stack;

public class leetcode1047 {
    public String removeDuplicates(String S) {
        if (S.length()==1) return S;
        Stack<Character> stack=new Stack<>();
        char[] chars=S.toCharArray();
        StringBuilder str=new StringBuilder();
        for (int i=0;i<chars.length;i++){
            if (stack.size()!=0&&stack.peek()==chars[i]) stack.pop();
            else stack.push(chars[i]);
        }

        while (stack.size()!=0){
            str.insert(0,stack.pop());
        }
        return str.reverse().toString();
    }
}
