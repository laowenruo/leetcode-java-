package leetcode.ListNode1.剑指offer;

import java.util.Stack;

public class offer06 {
    public int[] reversePrint(ListNode.剑指offer.ListNode head) {
        Stack<Integer> stack=new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head=head.next;
        }
        int length=stack.size();
        int[] sum=new int[length];
        for (int i=0;i<length;i++){
            sum[i]=stack.pop();
        }
        return sum;
    }
    public int[] reversePrint1(ListNode.剑指offer.ListNode head) {   //不使用空间
        int length=0;
        ListNode.剑指offer.ListNode node=head;
        while (head!=null){
            length++;
            head=head.next;
        }
        int[] sum=new int[length];
        for (int i=length-1;i<0;i++){
            sum[i]=node.val;
            node=node.next;
        }
        return sum;
    }
}
