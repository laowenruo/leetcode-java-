package leetcode题目.ListNode;

import java.util.concurrent.ArrayBlockingQueue;

public class PC {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
        new Producer(queue).start();
        new Consumer(queue).start();
    }
}
