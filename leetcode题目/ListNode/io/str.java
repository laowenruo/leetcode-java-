package leetcode题目.ListNode.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList arrayList = new ArrayList<String>();
        for (int i=0;i<n;i++){
            arrayList.add(in.next());
        }
        Collections.sort(arrayList);
        for (int i=0;i<n-1;i++){
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.print(arrayList.get(n-1));
    }
}
