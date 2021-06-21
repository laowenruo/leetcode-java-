package leetcode.ListNode1.剑指offer;

import java.util.HashSet;

public class hasCycle {
    public boolean hasCycle(ListNode.剑指offer.ListNode head) {
        HashSet<ListNode.剑指offer.ListNode> hashSet=new HashSet<>();
        while (head!=null){
            if (hashSet.add(head)) head=head.next;
            else return false;
        }
        return true;
    }
}