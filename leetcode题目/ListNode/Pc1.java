package leetcode题目.ListNode;

import java.util.LinkedList;
import java.util.Random;

public class Pc1 {
    public static volatile LinkedList<Integer> linkedList=new LinkedList<>();
    public static Object lock=new Object();
    public static void main(String[] args) {
        new Thread(new Consumer(linkedList,10)).start();
        new Thread(new Producer(10,linkedList)).start();
    }
    static class Producer implements Runnable{
        public LinkedList<Integer> linkedList;
        public int max;

        public Producer(int max,LinkedList linkedList){
            this.max=max;
            this.linkedList=linkedList;
        }
        @Override
        public void run() {
            while (true){
                synchronized (lock){
                    while (linkedList.size()>max){
                        try {
                            System.out.println("-------生产者正在等待------");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int random=new Random().nextInt(10);
                    linkedList.offer(random);
                    lock.notifyAll();
                    System.out.println("生产者生产了"+random);
                }
            }
        }
    }
    static class Consumer implements Runnable{
        public LinkedList<Integer> linkedList ;
        public int max;
        public Consumer(LinkedList linkedList,int max){
            this.linkedList=linkedList;
            this.max=max;
        }
        @Override
        public void run() {
            while (true){
                synchronized (lock){
                    while (linkedList.isEmpty()){
                        System.out.println("-------消费者正在等待-------");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Integer poll = linkedList.poll();
                    lock.notifyAll();
                    System.out.println("消费者消费了"+poll);
                }
            }
        }
    }
}
