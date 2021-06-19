package leetcode题目.ListNode.剑指offer.中等题;

import leetcode题目.ListNode.剑指offer.ListNode;/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class sum {
    /**
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode.剑指offer.ListNode addInList (ListNode.剑指offer.ListNode head1, ListNode.剑指offer.ListNode head2) {
        // write code here
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode.剑指offer.ListNode l1=reverse(head1);
        ListNode.剑指offer.ListNode l2=reverse(head2);
        ListNode.剑指offer.ListNode result=new ListNode.剑指offer.ListNode(0);
        int c=0;
        while(l1!=null||l2!=null||c!=0)
        {
            int v1=l1!=null?l1.val:0;
            int v2=l2!=null?l2.val:0;
            int val=v1+v2+c;
            c=val/10;
            ListNode.剑指offer.ListNode cur=new ListNode.剑指offer.ListNode(val%10);
            cur.next=result.next;
            result.next=cur;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return result.next;
    }

    public ListNode.剑指offer.ListNode reverse(ListNode.剑指offer.ListNode node)
    {
        if(node==null) return node;
        ListNode pre=null,next=null;
        while(node!=null)
        {
            next=node.next;
            node.next=pre;
            pre=node;
            node=next;
        }
        return pre;
    }

}