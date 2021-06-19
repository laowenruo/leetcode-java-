package leetcode题目.ListNode.剑指offer;

public class offer35 {
    public ListNode.剑指offer.Node copyRandomList(ListNode.剑指offer.Node head) {
        if (head==null) return null;
        ListNode.剑指offer.Node p=head;
        while (p!=null){   //每个节点复制一次
            ListNode.剑指offer.Node newNode=new ListNode.剑指offer.Node(p.val);
            newNode.next=p.next;
            p.next=newNode;
            p=newNode.next;
        }
        p=head;
        while (p!=null){
            if (p.random!=null){
                p.next.random=p.random.next;
            }
            p=p.next.next;
        }
        ListNode.剑指offer.Node dummy=new ListNode.剑指offer.Node(-1);
        p=head;
        ListNode.剑指offer.Node cur=dummy;
        //分离链表
        while (p!=null){
            cur.next=p.next;
            cur=cur.next;
            p.next=cur.next;
            p=p.next;
        }
        return dummy.next;
    }
}
