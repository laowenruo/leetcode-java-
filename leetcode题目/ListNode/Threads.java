package leetcode题目.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Threads {
    private static String lock = "lock";

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>(10);
        final Integer max = 10;
        produce produce1 = new produce(list, max);
        produce produce2 = new produce(list, max);
        consumer consumer = new consumer(list, max);
        consumer.start();
        produce1.start();
        produce2.start();
    }

    static class produce extends Thread {
        final List<Integer> list;
        final Integer max;

        public produce(List<Integer> list, Integer max) {
            this.list = list;
            this.max = max;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (list.size() > max) {
                        try {
                            lock.wait();
                            System.out.println("生产数据已满  线程" + Thread.currentThread().getName() + "已停止");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int random = new Random().nextInt(10);
                    list.add(random);
                    lock.notifyAll();
                    System.out.println("线程" + Thread.currentThread().getName() + "正在生产数据" + random);
                }
            }
        }
    }

    static class consumer extends Thread {
        final List<Integer> list;
        final Integer max;

        public consumer(List<Integer> list, Integer max) {
            this.list = list;
            this.max = max;
        }

        @Override

        public void run() {
            while (true) {
                synchronized (lock) {
                    while (list.isEmpty()) {
                        try {
                            lock.wait();
                            System.out.println("消费数据已空  线程" + Thread.currentThread().getName() + "已停止");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int random = list.remove(0);
                    lock.notifyAll();
                    System.out.println("线程" + Thread.currentThread().getName() + "正在消费数据" + random);
                }

            }
        }
    }

}
