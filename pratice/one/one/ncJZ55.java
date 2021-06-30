package pratice.one.one;

import pratice.one.basic.ListNode;

public class ncJZ55 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead==null||pHead.next==null){
            return null;
        }
        ListNode fast=pHead;
        ListNode slow=pHead;
        do {
            fast=fast.next.next;
            slow=slow.next;
        }while (fast!=slow);
        fast=pHead;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}
