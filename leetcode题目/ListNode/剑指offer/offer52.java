package leetcode题目.ListNode.剑指offer;

import java.util.Hashtable;

public class offer52 {
    public ListNode.剑指offer.ListNode getIntersectionNode1(ListNode.剑指offer.ListNode headA, ListNode.剑指offer.ListNode headB) {        //笨蛋方法
        Hashtable<Integer, ListNode.剑指offer.ListNode> hashtable=new Hashtable<>();
        for (ListNode.剑指offer.ListNode tempA = headA; tempA!=null; tempA=tempA.next) hashtable.put(tempA.hashCode(),tempA);
        for (ListNode.剑指offer.ListNode tempB = headB; tempB!=null; tempB=tempB.next) {
            if (hashtable.containsKey(tempB.hashCode()))  return tempB;
        }
        return  null;
    }
    public ListNode.剑指offer.ListNode getIntersectionNode(ListNode.剑指offer.ListNode headA, ListNode.剑指offer.ListNode headB) {
        ListNode A=headA,B=headB;
        while (A!=B){
           A=A==null?headB:A.next;
           B=B==null?headA:B.next;
        }
        return A;
    }
}
