package leetcode.ListNode1.leetcode题目;

import java.util.Hashtable;

public class leetcode160 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Hashtable<Integer, ListNode> hashtable=new Hashtable<>();
            for (ListNode tempA = headA; tempA!=null; tempA=tempA.next) hashtable.put(tempA.hashCode(),tempA);
            for (ListNode tempB = headB; tempB!=null; tempB=tempB.next) {
                if (hashtable.containsKey(tempB.hashCode()))  return tempB;
            }
            return  null;
        }
    }
}
