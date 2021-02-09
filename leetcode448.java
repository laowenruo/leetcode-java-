import leetcode.合并两个有序链表.ListNode;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
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

}
