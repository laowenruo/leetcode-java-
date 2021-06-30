package leetcode.剑指offer.中等题;

import leetcode.剑指offer.ListNode;

/*
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
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode l1=reverse(head1);
        ListNode l2=reverse(head2);
        ListNode result=new ListNode(0);
        int c=0;
        while(l1!=null||l2!=null||c!=0)
        {
            int v1=l1!=null?l1.val:0;
            int v2=l2!=null?l2.val:0;
            int val=v1+v2+c;
            c=val/10;
            ListNode cur=new ListNode(val%10);
            cur.next=result.next;
            result.next=cur;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return result.next;
    }

    public ListNode reverse(ListNode node)
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