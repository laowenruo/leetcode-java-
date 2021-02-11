public class offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode list=null;
        while (head!=null){
            ListNode temp=head.next;
            head.next=list;
            list=head.next;
            head=temp;
        }
        return list;
    }
}
