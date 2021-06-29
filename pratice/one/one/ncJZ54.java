package pratice.one.one;

import java.util.LinkedList;
import java.util.Queue;

public class ncJZ54 {
    private Queue<Character> queue=new LinkedList<>();
    private int[] chars=new int[128];
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        chars[ch]++;
        queue.offer(ch);
        while (!queue.isEmpty()&&chars[queue.peek()]>1){
            queue.poll();
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        return queue.isEmpty() ? '#' : queue.peek();

    }
}
