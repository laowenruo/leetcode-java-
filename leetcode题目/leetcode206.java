package leetcode题目;

public class leetcode206 {
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
        public ListNode reverseList(ListNode head) {
            ListNode pre = null; //前节点
            ListNode cur = head;
            while(cur!=null) {
               ListNode temp=cur.next;
               cur.next=pre;
               pre=cur;
               cur=temp;
            }
          return pre;
        }
    }
}
