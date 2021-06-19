package leetcode题目.ListNode.剑指offer;

public class offer22 {
    public ListNode.剑指offer.ListNode getKthFromEnd(ListNode.剑指offer.ListNode head, int k) {
        ListNode.剑指offer.ListNode node=head;
        while ((k--)!=0) node=node.next;
        while (node!=null){
            node=node.next;
            head=head.next;
        }
      return head;
    }
    public ListNode.剑指offer.ListNode getKthFromEnd1(ListNode.剑指offer.ListNode head, int k) {
        ListNode temp=head;
        while ((k--)!=0){
            temp=temp.next;
        }
        while (temp!=null){
            head=head.next;
            temp=temp.next;
        }
        return head;
    }
}
