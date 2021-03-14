package 剑指offer;

import java.util.Hashtable;

public class offer52 {
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {        //笨蛋方法
        Hashtable<Integer, ListNode> hashtable=new Hashtable<>();
        for (ListNode tempA = headA; tempA!=null; tempA=tempA.next) hashtable.put(tempA.hashCode(),tempA);
        for (ListNode tempB = headB; tempB!=null; tempB=tempB.next) {
            if (hashtable.containsKey(tempB.hashCode()))  return tempB;
        }
        return  null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA,B=headB;
        while (A!=B){
           A=A==null?headB:A.next;
           B=B==null?headA:B.next;
        }
        return A;
    }
}
