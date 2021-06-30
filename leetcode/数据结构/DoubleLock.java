package leetcode.数据结构;

public class DoubleLock {

    private  static DoubleLock doubleLock;

    private DoubleLock(){

    }

    public static DoubleLock getInstance(){
        if (doubleLock == null){
            synchronized (DoubleLock.class){
                if (doubleLock == null){
                    doubleLock = new DoubleLock();
                }
            }
        }
        return doubleLock;
    }
}
