package leetcode.ListNode1.剑指offer.中等题;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(2);
        Collections.sort(list, (o1,o2)->o2.compareTo(o1));
        list.forEach(System.out::println);
    }
}
