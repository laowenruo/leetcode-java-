package leetcode题目;
import java.util.ArrayList;



  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class leetcode234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int len = list.size();
        for (int i = 0; i < len / 2 + 1; i++) {
            if (list.get(i) - list.get(len - 1) != 0) return false;
        }
        return true;
    }
    public boolean isPalindrome1(ListNode head) {
        ListNode fast=head,slow=head;
        while (fast!=null||fast.next!=null) {
            fast=fast.next.next;  //从头指针开始每次走2步，若fast.next为空，则为奇数
            slow=slow.next;
        }
        if (fast!=null) {  //奇数向前一步，中间无需判断
            slow=slow.next;
        }
        slow=reverse(slow);
        fast=head;
        while (slow!=null) {
            if (fast.val!=slow.val) return false;
            slow=slow.next;
            fast=fast.next;
        }
        return  true;
    }
    public ListNode reverse(ListNode head){
        ListNode newNode=null;
        while (head!=null){
            ListNode temp=head.next;
            head.next=newNode;
            newNode=head;
            head=temp;
        }
        return  newNode;
    }

}
