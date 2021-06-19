package leetcode题目.ListNode.leetcode题目;

public class leetcode19 {
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
            public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode dummyNode=new ListNode(-1);
                dummyNode.next=head;
                ListNode fast=dummyNode,slow=dummyNode;
                while (n!=0){
                    fast=fast.next;
                    n--;
                }
                while (fast.next!=null){
                    slow=slow.next;
                    fast=fast.next;
                }
                slow.next=slow.next.next;
                return dummyNode.next;
            }
        }
}
