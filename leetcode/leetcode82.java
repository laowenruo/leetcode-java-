package leetcode;

import org.junit.Test;

import java.util.Stack;

public class leetcode82 {
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
        public ListNode deleteDuplicates(ListNode head) {
            Stack<ListNode> stack=new Stack<>();
            int temp=Integer.MIN_VALUE;
            while (head!=null){
                if (temp==head.val){
                    head=head.next;
                    continue;
                }
                else if (stack.isEmpty()||head.val!=stack.peek().val){
                    stack.add(head);
                }
                else {
                    ListNode pop = stack.pop();
                    temp=pop.val;
                }
                head=head.next;
            }
            ListNode pre=null;
            while (!stack.isEmpty()){
                ListNode poll = stack.pop();
                poll.next=pre;
                pre=poll;
            }
            return pre;
        }
    }
    @Test
    public void test(){
        ListNode head=new ListNode(1);
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(1);
        ListNode head3=new ListNode(3);
        head.next=head1;
        head1.next=head2;
        head2.next=head3;
        new Solution().deleteDuplicates(head);
    }
}
