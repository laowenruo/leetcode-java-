package leetcode题目.ListNode;

public class leetcode234 {
    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null) return true;
        ListNode fast=head;
        ListNode slow=head;
        ListNode pre=null;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            ListNode temp=slow.next;
            slow.next=pre;
            pre=slow;
            slow=temp;
        }
        if (fast!=null) slow=slow.next;
        while (pre!=null&&slow!=null){
            if (pre.val!=slow.val) return false;
            pre=pre.next;
            slow=slow.next;
        }
        return true;
    }
}
