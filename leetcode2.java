import leetcode.合并两个有序链表.ListNode;

public class leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode l=new ListNode();
    int num=0;//进位标志
    while (l1==null&l2==null){
        if (l1==null) l1.val=0;
        if (l2==null) l2.val=0;
        if (l1.val+l2.val>=10){
            l.val= l1.val+l2.val-10;
            l=l.next;
            l.val=1;
        }else {
            l.val= l1.val+l2.val;
            l=l.next;
        }
        l1=l1.next;
        l2=l2.next;
    }
        return l;
    }

    public static void main(String[] args) {

    }
}
