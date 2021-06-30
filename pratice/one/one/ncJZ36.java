package pratice.one.one;

import pratice.one.basic.ListNode;

public class ncJZ36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null||pHead2==null){
            return null;
        }
        ListNode l1=pHead1,l2=pHead2;
        while (l1!=l2){
            l1=l1==null?pHead2:l1.next;
            l2=l2==null?pHead1:l2.next;
        }
        return l1;
    }
}
