package leetcode.ListNode1.剑指offer;

import java.util.LinkedList;

public class offer09 {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public offer09() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.size() == 0) {
          while (stack1.size() != 0) { stack2.push(stack1.pop()); }
        }
        if (stack2.size()==0&&stack1.size()==0) return -1;
        return stack2.pop();
    }
}
