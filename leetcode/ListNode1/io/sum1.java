package leetcode.ListNode1.io;

import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while (n!=0){
            System.out.println(in.nextInt()+in.nextInt());
            n--;
        }
    }
}
