package leetcode.ListNode1.剑指offer;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class offer138 {

    public Node copyRandomList(Node head) {
        if (head==null) return null;
        Node p=head;
        while (p!=null){   //每个节点复制一次
            Node newNode=new Node(p.val);
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
        Node dummy=new Node(-1);
        p=head;
        Node cur=dummy;
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
