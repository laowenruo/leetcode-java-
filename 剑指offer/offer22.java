package 剑指offer;

public class offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node=head;
        while ((k--)!=0) node=node.next;
        while (node!=null){
            node=node.next;
            head=head.next;
        }
      return head;
    }
}
