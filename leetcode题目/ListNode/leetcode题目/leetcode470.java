package leetcode题目.ListNode.leetcode题目;

import java.util.Random;

public class leetcode470 {
    public int rand7(){
        return new Random().nextInt(8);
    }
    public int rand10() {
        int temp=(rand7()-1)*7+rand7();
        while (temp>10){
            temp=(rand7()-1)*7+rand7();
        }
        return temp;
    }
}
