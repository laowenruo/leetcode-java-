package leetcode题目.ListNode;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends Thread {
    ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
    public Consumer(ArrayBlockingQueue<Integer> queue){
        this.queue=queue;
    }
    @Override
    public void run(){
        while (true){
            Integer take=null;
            try {
                take = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者拿到了"+take);
        }
    }
}
