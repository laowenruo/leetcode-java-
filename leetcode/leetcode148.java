package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode148 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode sortList(ListNode head) {
            if (head==null){
                return null;
            }
            PriorityQueue<ListNode> nodes=new PriorityQueue<>(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val-o2.val;
                }
            });
            ListNode preNode=new ListNode(-1);
            ListNode temp=preNode;
            while (head!=null){
                nodes.offer(head);
                head=head.next;
            }
            while (!nodes.isEmpty()){
                preNode.next=nodes.poll();
                preNode.next.next=null;
                preNode=preNode.next;
            }
            return temp.next;
        }
    }
}
