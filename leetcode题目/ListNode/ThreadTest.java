package leetcode题目.ListNode;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadTest implements Runnable{
    public CyclicBarrier createBarrier;
    public int id;
    public ThreadTest(int id,CyclicBarrier createBarrier){
        this.id=id;
        this.createBarrier=createBarrier;
    }
    @Override
    public void run() {
        System.out.println("玩家"+id+"正在进入第一关");
        try {
            createBarrier.await();
            System.out.println("玩家"+id+"正在进入第二关");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
