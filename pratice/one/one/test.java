package pratice.one.one;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class test {
    private static final int CAPACITY=5;

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Thread producer1 =new Producer("P-1",queue,CAPACITY);
        Thread producer2 =new Producer("P-2",queue,CAPACITY);
        Thread producer3 =new Producer("P-3",queue,CAPACITY);
        Thread consumer1 =new Consumer("C-1",queue,CAPACITY);
        Thread consumer2 =new Consumer("C-2",queue,CAPACITY);
        Thread consumer3 =new Consumer("C-3",queue,CAPACITY);
        producer1.start();
//        producer2.start();
//        producer3.start();
        consumer1.start();
//        consumer2.start();
//        consumer3.start();
    }
    public static class Producer extends Thread{
        private Queue<Integer> queue;
        String name;
        int maxSize;
        int i=0;
        public Producer(String name,Queue<Integer> queue,int maxSize){
            super(name);
            this.name=name;
            this.queue=queue;
            this.maxSize=maxSize;
        }
        @Override
        public void run(){
            while (true){
                synchronized (queue){
                    while (queue.size()==maxSize){
                        try {
                            System.out.println("Queue if full,Producer["+name+"]thread waiting for");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("["+name+"] producing value :"+i);
                    queue.offer(i++);
                    queue.notifyAll();
                    try{
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static class Consumer extends Thread{
        private Queue<Integer> queue;
        String name;
        int maxSize;
        public Consumer(String name,Queue<Integer> queue,int maxSize){
            super(name);
            this.name=name;
            this.maxSize=maxSize;
            this.queue=queue;
        }
        @Override
        public void run(){
            synchronized (queue){
                while (true){
                    while (queue.size()==0){
                        try {
                            System.out.println("Queue if empty,Consumer["+name+"]thread waiting for");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("["+name+"] consuming value :"+queue.poll());
                    queue.notifyAll();
                    try{
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
