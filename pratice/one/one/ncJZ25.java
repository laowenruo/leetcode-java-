package pratice.one.one;

import pratice.one.basic.RandomListNode;

public class ncJZ25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead==null||pHead.next==null){
            return pHead;
        }
        RandomListNode cloneNode=pHead;
        //克隆next指针
        while (cloneNode!=null){
            RandomListNode listNode=new RandomListNode(cloneNode.label);
            listNode.next=cloneNode.next;
            cloneNode.next=listNode;
            cloneNode=cloneNode.next.next;
        }
        cloneNode=pHead;
        //克隆random指针
        while (cloneNode!=null){
            RandomListNode clone=cloneNode.next;
            if (cloneNode.random!=null){
                clone.random=cloneNode.random.next;
            }
            cloneNode=clone.next;
        }
        cloneNode=pHead;
        RandomListNode result=pHead.next;
        //断开连接
        while (cloneNode.next!=null){
            RandomListNode next=cloneNode.next;
            cloneNode.next=next.next;
            cloneNode=next;
        }
        return  result;
    }
}
