package pratice.one.one;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ncJZ29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (input.length<k||k<=0){
            return new ArrayList<>();
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>((o1, o2) -> o1-o2);
        for (int i : input) {
            queue.offer(i);
            if (queue.size()>k){
                queue.poll();
            }
        }
        return new ArrayList<>(queue);
    }
}
