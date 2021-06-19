package leetcode题目.ListNode.剑指offer;

public class offer24 {
    public ListNode.剑指offer.ListNode reverseList(ListNode.剑指offer.ListNode head) {
        ListNode.剑指offer.ListNode list=null;
        while (head!=null){
            ListNode temp=head.next;
            head.next=list;
            list=head.next;
            head=temp;
        }
        return list;
    }
}
