package leetcode题目.ListNode.PAT.乙级;

import java.util.Scanner;

public class tip01 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int temp=scan.nextInt();
        long a=0,b=0,c=0;
        for(int i=1;i<=temp;i++){
            a=scan.nextLong();
            b=scan.nextLong();
            c=scan.nextLong();
            if(a+b>c) System.out.println("Case #"+i+": true");
            else System.out.println("Case #"+i+": false");
        }
    }
}
