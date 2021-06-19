package leetcode题目.ListNode.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class cinima {
    public static void main(String[] args) throws IOException {
        List<Integer> list=new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
          String line=bufferedReader.readLine();
          String[] strings = line.split(" ");
          for (int i=0;i< strings.length;i++){
              list.add(Integer.parseInt(strings[i]));
          }
        }
        //记录距离
        int max=0;
        int count=0;
        boolean head=true,tail=true;
        for (int i=0;i<list.size();i++) {
            if (list.get(i)==1) {
                count=0;
            }
            else {
                count++;
                max=Math.max(max,count);
            }
        }
        int temp1=0;
        for (int i=0;temp1<max;i++){
            if (list.get(i)!=0) {
                head=false;
                break;
            }
            else {
                temp1++;
            }
        }
        int temp=0;
        for (int i=list.size()-1;temp<max;i--){
            if (list.get(i)!=0) {
                tail=false;
                break;
            }
            else {
                temp++;
            }
        }
        int a=temp1>temp?temp1:temp;
        if (a>(max+1)/2) {
            System.out.println(a);
        }
        else if (max%2==0){
            System.out.println(max/2);
        }
        else {
            System.out.println((max+1)/2);
        }
    }
}
