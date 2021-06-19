package leetcode题目.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//case 80%
public class Examscore {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n=Integer.parseInt(i.nextLine());
        int[] nums=new int[n];
        List<Integer> list=new ArrayList<>();
        int result=0;
        for (int j=0;j<n;j++){
            nums[j]=i.nextInt();
        }
        for (int j=0;j<n;j++){
            if (nums[j]%5==0) {
                list.add(nums[j]);
            }
            result+=nums[j];
        }
        if (result%10==5){
            list.sort((a,b)-> a.compareTo(b));
            result=result-list.get(0);
        }
        System.out.println(result);
    }
}
