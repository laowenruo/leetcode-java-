package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode23 {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists){
            ListNode dummy=new ListNode(-1);
            ListNode temp=dummy;
            PriorityQueue priorityQueue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val - o2.val;
                }
            });
            for (ListNode list : lists) {
                if (list==null){
                    continue;
                }
                priorityQueue.add(list);
            }
            while (!priorityQueue.isEmpty()){
                ListNode poll = (ListNode) priorityQueue.poll();
                temp.next=poll;
                temp=temp.next;
                if (poll.next!=null){
                    priorityQueue.offer(poll.next);
                }
            }
            return dummy.next;

        }
    }
}
