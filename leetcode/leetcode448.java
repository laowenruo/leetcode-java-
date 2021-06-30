package leetcode;

import java.util.LinkedList;
import java.util.List;

public class leetcode448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list= new LinkedList<Integer>();
        for (int i=0;i<nums.length;i++) {
            int index=Math.abs(nums[i])-1;
            if (nums[index]>0)
            nums[index]*=-1;
        }
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]>0) list.add(i+1);
        }
        for (int temp:
             nums) {
            System.out.println(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("测试");
    }
}
