package pratice.one.one;

import java.util.concurrent.LinkedBlockingQueue;

public class test2 {
    public static final int CAPACITY=5;

    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue=new LinkedBlockingQueue<>(CAPACITY);
        Thread producer=new Producer("P-1",queue,CAPACITY);
        Thread consumer=new Consumer("C-1",queue,CAPACITY);
        producer.start();
        consumer.start();
    }
    public static class Producer extends Thread{
        private LinkedBlockingQueue<Integer> queue;
        String name;
        int maxsize;
        int i;
        public Producer(String name,LinkedBlockingQueue<Integer> queue,int maxsize){
            super(name);
            this.queue=queue;
            this.maxsize=maxsize;
            this.name=name;
        }
        @Override
        public void run(){
            while (true){
                try {
                    queue.put(i);
                    System.out.println("生产了"+(i++));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Consumer extends Thread{
        private LinkedBlockingQueue<Integer> queue;
        String name;
        int maxsize;
        public Consumer(String name,LinkedBlockingQueue<Integer> queue,int maxsize){
            super(name);
            this.queue=queue;
            this.maxsize=maxsize;
            this.name=name;
        }
        @Override
        public void run(){
            while (true){
                try {
                    System.out.println("消费了"+queue.take());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
