package leetcode.ListNode1.leetcode题目;

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
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int count=0;
        while (l1!=null||l2!=null){
            int a=l1==null?0:l1.val;
            int b=l2==null?0:l2.val;
            int sum=a+b+count;
            //进位清零
            count=0;
            if (sum>=10){
                count=1;
            }
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
        }
        if (count==1){
            temp.next=new ListNode(1);
        }
        return dummy.next;
    }
    }

