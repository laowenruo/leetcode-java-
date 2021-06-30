package leetcode;

import org.junit.Test;

import java.util.ArrayList;

public class leetcode143 {
    public void reorderList(ListNode head) {
        ArrayList<ListNode> listNodes=new ArrayList<>();
        while (head!=null){
            listNodes.add(head);
            head=head.next;
        }
        int j=listNodes.size()-1;
        int i=0;
        while (i<j){
            listNodes.get(j).next= listNodes.get(i).next;
            listNodes.get(i).next= listNodes.get(j);
            i++;
            j--;
            if (i==j){
                break;
            }
        }
        listNodes.get(i).next=null;
    }
    @Test
    public void test() throws InterruptedException {
        ListNode listNode=new ListNode(1);
        ListNode listNode1=new ListNode(2);
        ListNode listNode2=new ListNode(3);
        ListNode listNode3=new ListNode(4);
        ListNode listNode4=new ListNode(5);
        listNode.next=listNode1;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        reorderList(listNode);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}
