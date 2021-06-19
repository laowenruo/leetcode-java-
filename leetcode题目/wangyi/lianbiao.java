package leetcode题目.wangyi;

import leetcode题目.ListNode.ListNode;
import org.junit.Test;

/**
 * @author Ryan
 */
public class lianbiao {
    public ListNode dunstan(ListNode l1, ListNode l2){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        ListNode listNode=new ListNode();
        ListNode head=null;
        listNode.next=head;
        int a,b,res,count=0,temp;
        while (l1!=null){
            str1.append(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            str2.append(l2.val);
            l2=l2.next;
        }
        a=Integer.parseInt(str1.toString());
        b=Integer.parseInt(str2.toString());
        res=a-b;
        temp=res;
        while (temp!=0){
            temp=temp/10;
            count++;
        }
        for (int i=0,n=10;i<count;i++){
            temp=res%10;
            ListNode listNode1=new ListNode(temp);
            listNode1.next=head;
            head=listNode1;
            res=res/10;
        }
        return head==null?new ListNode(0):head;
    }
    @Test
    public void testList(){
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(4);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        ListNode listNode4=new ListNode(2);
        ListNode listNode5=new ListNode(2);
        ListNode listNode6=new ListNode(4);
        listNode4.next=listNode5;
        listNode5.next=listNode6;
        System.out.println(dunstan(listNode1,listNode4).toString());
    }
}
