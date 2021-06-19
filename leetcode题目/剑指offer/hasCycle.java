package leetcode题目.剑指offer;

import java.util.HashSet;

public class hasCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet=new HashSet<>();
        while (head!=null){
            if (hashSet.add(head)) head=head.next;
            else return false;
        }
        return true;
    }
}