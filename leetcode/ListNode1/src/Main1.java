package leetcode.ListNode1.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int collide(int[] numbers) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        while (list.size()>=2){
            Collections.sort(list);
            int a=list.remove(list.size()-1);
            int b=list.remove(list.size()-1);
            int temp=a-b;
            if (temp==0){
                continue;
            }
            list.add(temp);
        }
        if (list.size()==0){
            return 0;
        }
        else {
            return list.get(0);
        }
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] stringArray = str.split("\\,");
        int[] numbers = new int[stringArray.length];
        for(int i=0;i<stringArray.length;i++){
            numbers[i] = Integer.parseInt(stringArray[i]);
        }

        int res = collide(numbers);
        System.out.println(String.valueOf(res));
    }
}
