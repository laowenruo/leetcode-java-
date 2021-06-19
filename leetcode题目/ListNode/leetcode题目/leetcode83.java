package leetcode题目.ListNode.leetcode题目;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return null;
        ListNode node=head; //保存头节点，便于返回
        ListNode temp;
        while (head.next!=null){
            while (head.next!=null&&head.next.val==head.val) {
                head.next=head.next.next;  //后移
            }
            if (head.next==null) return node;
            else head=head.next;
        }
        return node;
    }
    public ListNode removeDuplicateNodes(ListNode head){
        if (head==null) return null;
        ListNode node=head; //保存头节点，便于返回
        HashSet<Integer> hashSet=new HashSet<>();
        while (head.next!=null){
            hashSet.add(head.val);
            while (head.next!=null&&hashSet.contains(head.next.val)){
                head.next=head.next.next;  //后移
            }
            if (head.next==null) return node;
            else head=head.next;
        }
        return node;
    }
    public ListNode deleteDuplicates1(ListNode head){
        Deque<ListNode> stack=new ArrayDeque<>();
        if (head==null){
            return null;
        }
        stack.push(head);
        head=head.next;
        while (head!=null){
            if (stack.peek().val==head.val){
                stack.peek().next=head.next;
            }
            else {
                stack.push(head);
            }
            head=head.next;
        }
        return stack.peekFirst();
    }
}
