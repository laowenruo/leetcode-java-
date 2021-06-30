package leetcode.数据结构;

public class QueueArray {
    private int front;
    private int rear;
    private int maxSize;
    private int[] array;
    public QueueArray(int maxSize){
        this.maxSize=maxSize;
        front=-1;
        rear=-1;
        array=new int[maxSize];
    }
    public boolean ifFull(){
        return maxSize-1==rear;
    }
    public boolean isEmpty(){
        return front==rear;
    }
    public void inQueue(int value){
        if(!ifFull()) {
            rear++;
            array[rear]=value;
        }
        else {
            System.out.println("队列已满");
        }
    }
    public void DeQueue(){
        if (!isEmpty()) {
            front++;
            System.out.println(array[front]);
        }
        else {
            System.out.println("队列为空");
        }
    }
    public void showQueue(){
        if (!isEmpty()) {
            System.out.println("队列剩余元素");
            for (int i = 1; i <=rear ; i++) {
                System.out.println(array[front+i]);
            }
        }
        else {
            System.out.println("队列为空");
        }
    }

    public static void main(String[] args) {
        QueueArray queueArray=new QueueArray(5);
        queueArray.inQueue(5);
        queueArray.inQueue(7);
        queueArray.inQueue(7);
        queueArray.inQueue(7);
        queueArray.DeQueue();
        queueArray.showQueue();
    }
}

