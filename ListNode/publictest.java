package ListNode;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class publictest {
    public static void main(String[] args) throws InterruptedException {
//        CyclicBarrier cyclicBarrier=new CyclicBarrier(5, ()-> System.out.println("所有玩家进入第二关"));
//        for (int i=0;i<=4;i++){
//            new Thread(new ThreadTest(i,cyclicBarrier)).start();
//        }
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i=0;i<=4;i++){
            int finalI = i;
            countDownLatch.countDown();
            Thread.sleep(5000);
            new Thread(()-> System.out.println(finalI +"打印完毕")).start();
        }
        for (int i=5;i<=10;i++){
            int finalI = i;
            countDownLatch.await();
            new Thread(()-> System.out.println(finalI +"打印完毕")).start();
        }
    }
}
