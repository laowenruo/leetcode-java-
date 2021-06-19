package leetcode题目.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dictionary {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n=i.nextInt();
        int m=i.nextInt();
        List<Integer> list=new ArrayList<>();
        int[] nums=new int[m];
        for (int j=0;j<m;j++){
            nums[j]=i.nextInt();
        }
        int index=0;
        int temp=0;
        int temp1=1;
        while (index!=n-1) {
            for (; temp1 < nums[temp]; temp1++) {
                list.add(temp1);
                index++;
            }
            if (temp != m - 1) {
                list.add(nums[temp++]);
                index++;
                temp1 = nums[temp++];
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
