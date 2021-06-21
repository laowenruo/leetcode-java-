package leetcode.ListNode1.剑指offer;

public class offer18 {
    public ListNode.剑指offer.ListNode deleteNode(ListNode.剑指offer.ListNode head, int val) {
          ListNode.剑指offer.ListNode temp=head; //临时存放结点
          ListNode.剑指offer.ListNode A=head;
          if (head.val==val) {
              head=head.next;
              return  A;
          }
          while (head!=null){
              if (head.val==val){
                  if (temp.next==null) {temp.next=null; return A;}
                  else {
                      temp.next=head.next.next;
                      head.next=null;
                      return A;
                  }
              }
              temp=head;
              head=head.next;
          }
          return A;
    }
}
