package leetcode题目;

import java.util.Stack;

public class leetcode232 {
    private Stack stackone;
    private Stack stacktwo;
    /** Initialize your data structure here. */
    public leetcode232() {
     stackone=new Stack();
     stacktwo=new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackone.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
     if (stacktwo.size()!=0) return (int) stacktwo.pop();
     if (stackone.size()!=0) {
         while (stackone.size()!=0)
         stacktwo.push(stackone.pop());
     }
     return (int) stacktwo.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stacktwo.size()!=0) return (int) stacktwo.peek();
        if (stackone.size()!=0) {
            while (stackone.size()!=0)
                stacktwo.push(stackone.pop());
        }
        return (int) stacktwo.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
    if (stackone.size()==0&&stacktwo.size()==0) return true;
    else return false;
    }
}
