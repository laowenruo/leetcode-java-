package pratice.one.one;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test1 {
    private static final int CAPACITY=5;
    private static final Lock lock=new ReentrantLock();
    private static final Condition full=lock.newCondition();
    private static final Condition empty=lock.newCondition();

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Thread producer1 =new Producer("P-1",CAPACITY,queue);
        Thread consumer1 =new Consumer("C-1",CAPACITY,queue);
        producer1.start();
        consumer1.start();
    }
    public static class Producer extends Thread{
        private Queue<Integer> queue;
        String name;
        int maxsize;
        int i=0;
        public Producer(String name,int maxsize,Queue<Integer> queue){
            super(name);
            this.name=name;
            this.maxsize=maxsize;
            this.queue=queue;
        }
        @Override
        public void run(){
            while (true){
                lock.lock();
                while (queue.size()==maxsize){
                    try {
                        System.out.println("Queue is full");
                        full.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("produce"+i);
                queue.offer(i++);
                empty.signalAll();
                lock.unlock();
                try {
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Consumer extends Thread{

        private Queue<Integer> queue;
        String name;
        int maxsize;
        int i=0;
        public Consumer(String name,int maxsize,Queue<Integer> queue){
            super(name);
            this.name=name;
            this.maxsize=maxsize;
            this.queue=queue;
        }
        @Override
        public void run(){
            while (true){
                lock.lock();
                while (queue.size()==0){
                    try {
                        System.out.println("Queue is empty");
                        empty.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consume"+queue.poll());
                full.signalAll();
                lock.unlock();
                try {
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
