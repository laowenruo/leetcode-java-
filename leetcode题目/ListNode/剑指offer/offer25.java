package leetcode题目.ListNode.剑指offer;

public class offer25 {
    public ListNode.剑指offer.ListNode mergeTwoLists(ListNode.剑指offer.ListNode l1, ListNode.剑指offer.ListNode l2) {
        ListNode.剑指offer.ListNode temp;
        ListNode.剑指offer.ListNode n1=l1;
        ListNode n2=l2;
        if(l1==null||l2==null) return l1==null?l2:l1;
        if (l2.val<l1.val) {temp=l2; l2=l1; l1=l2;}
            while (l1 != null && l2 != null) {
                if (l2.val > l1.val) {
                    temp = l1.next;
                    l1.next = l2;
                    l2 = temp;
                    l1 = l1.next;
                } else
                    l1 = l1.next;
            }
        return l1==null?n2:n1;
    }
}
