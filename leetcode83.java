import java.util.HashSet;

public class leetcode83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return null;
        ListNode node=head; //保存头节点，便于返回
        ListNode temp;
        while (head.next!=null){
            while (head.next!=null&&head.next.val==head.val) {
                head.next=head.next.next;  //后移
            }
            if (head.next==null) return node;
            else head=head.next;
        }
        return node;
    }
    public ListNode removeDuplicateNodes(ListNode head){
        if (head==null) return null;
        ListNode node=head; //保存头节点，便于返回
        HashSet<Integer> hashSet=new HashSet<>();
        while (head.next!=null){
            hashSet.add(head.val);
            while (head.next!=null&&hashSet.contains(head.next.val)){
                head.next=head.next.next;  //后移
            }
            if (head.next==null) return node;
            else head=head.next;
        }
        return node;
    }
}
