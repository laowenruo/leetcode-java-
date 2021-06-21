package leetcode.ListNode1;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread{
    //默认阻塞队列
    ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
    public Producer(ArrayBlockingQueue<Integer> queue){
        this.queue=queue;
    }
    @Override
    public void run(){
        while (true){
            Integer random=new Random().nextInt(10);
            queue.add(random);
            System.out.println("生产了"+random);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
