package pratice.one.one;

import leetcode.ListNode1.ListNode;

public class ncJZ56 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead==null||pHead.next==null){
            return null;
        }
        ListNode next=pHead.next;
        if (pHead.val==next.val){
            while (next!=null&&pHead.val==next.val){
                next=next.next;
            }
            return deleteDuplication(next);
        }else {
            pHead.next=deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
