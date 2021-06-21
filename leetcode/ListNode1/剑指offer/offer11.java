package leetcode.ListNode1.剑指offer;

import java.util.ArrayList;
import java.util.List;

public class offer11 {
    public int minArray(int[] numbers) {
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        list.add(numbers[0]);
        for (int i=1;i< numbers.length;i++){
            if (numbers[i]-numbers[i-1]!=1) list.add(numbers[i]);
        }
        for (Integer integer : list) {
            if (integer<min) min=integer;
        }
        return min;
    }
}
