package pratice.one.one;

import org.junit.Test;

import java.util.ArrayList;
import java.util.PriorityQueue;
//输入：
//        [2,3,4,2,6,2,5,1],3
//        复制
//        返回值：
//        [4,4,6,6,6,5]

public class ncJZ64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        PriorityQueue<Integer> queue=new PriorityQueue<>((o1, o2) -> o2-o1);
        ArrayList<Integer> list=new ArrayList<>();
        if (size> num.length||size<1){
            return list;
        }
        for (int i=0;i<size;i++){
            queue.add(num[i]);
        }
        list.add(queue.peek());
        for (int i=0,j=i+size;j< num.length;j++,i++){
            queue.remove(num[i]);
            queue.add(num[j]);
            list.add(queue.peek());
        }
        return list;
    }
    @Test
    public void testMax(){
        maxInWindows(new int[]{2,3,4,2,6,2,5,1},3);
    }
}
