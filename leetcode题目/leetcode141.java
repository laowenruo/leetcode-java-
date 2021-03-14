package leetcode题目;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class leetcode141 {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> hashMap=new HashMap<>();
        if (head==null||head.next==null) return false;
        while (head!=null){
            hashMap.put(head, head.val);
            head=head.next;
            if (!hashMap.containsKey(head)){
                return true;
            }
        }
        return false;
    }
    public boolean hasCycle1(ListNode head) {   //理解龟兔赛跑，快的转圈能遇上慢的，不然就是判断尾指针为控
        if (head==null||head.next==null) return false;
        ListNode fast=head.next;
        ListNode slow=head;
        while(slow!=fast){
            if (fast==null||fast.next==null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
