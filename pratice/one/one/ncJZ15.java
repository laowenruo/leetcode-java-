package pratice.one.one;

import pratice.one.basic.ListNode;

public class ncJZ15 {
    public ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode pre=null;
        while (head!=null){
            ListNode temp=head.next;
            head.next=pre;
            pre=head;
            head=temp;
        }
        return pre;
    }
    public ListNode ReverseList1(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        head.next=null;
        ListNode Node=ReverseList(next);
        next.next=head;
        return Node;
    }
}
