package leetcode题目.程序员面试金典;

import java.util.HashSet;

public class listnode_02_07 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet=new HashSet<>();
        if (headA==null||headB==null) return null;
        if (headA.next==null&&headB.next==null) return  headA.val==headB.val?headA:null;
        boolean falg=false;
        while (headA.next!=null) {
            hashSet.add(headA);
            headA=headA.next;
        }
        while (headB.next!=null){
            if (hashSet.contains(headB)) {falg=true;break;}
            headB=headB.next;
        }
        if (falg==false) return null;
        return headB;
    }
}
