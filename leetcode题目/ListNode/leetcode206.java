package leetcode题目.ListNode;

import org.junit.Test;

public class leetcode206 {
    private ListNode result=new ListNode(0,null);
    /**
     * 反转链表，迭代
     */
    public ListNode reverseList1(ListNode head) {       //迭代
        if (head==null||head.next==null) return head; //边界条件
        ListNode temp;
        ListNode result=null; //头节点
        while (head!=null){
            temp=head.next;
            head.next=result;
            result=head;
            head=temp;
        }
        return result;
    }
    public ListNode reverseList(ListNode head) {       //递归
        if (head==null||head.next==null) return head; //边界条件
        ListNode temp=result;
        reverseList_digui(head);
        return temp.next;
    }
    public void reverseList_digui(ListNode head){
        if (head==null) return ;
        reverseList_digui(head.next);
        head.next=null;       //避免形成环
        result.next=head;
        result=result.next;
    }
    @Test
    public void test(){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(reverseList(a).toString());
    }
}
