package pratice.one.one;

import pratice.one.basic.ListNode;
public class ncJZ14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if (pHead==null){
            return null;
        }
        ListNode pNode=pHead;
        while (pNode!=null&&k!=0){
            pNode=pNode.next;
            k--;
        }
        if (k>0){
            return null;
        }
        while (pNode!=null){
            pHead=pHead.next;
            pNode=pNode.next;
        }
        return pHead;
    }
}
