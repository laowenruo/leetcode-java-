package leetcode.ListNode1.leetcode题目;

public class leetcode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode res=dummy;
        for (int i=1;i<left;i++){
            res=res.next;
        }
        //起点
        ListNode node=res.next;
        ListNode pre=null,temp=null;
        for (int i=left;i<=right;i++){
            temp=node.next;
            node.next=pre;
            pre=node;
            node=temp;
        }
        res.next.next=temp;
        node.next=pre;
        return res.next;
    }
    public static ListNode reverse(ListNode head){
        ListNode temp;
        ListNode pre=null;
        while (head!=null){
            temp=head.next;
            head.next=null;
            head.next=pre;
            pre=head;
            head=temp;
        }
        return pre;
    }
}
