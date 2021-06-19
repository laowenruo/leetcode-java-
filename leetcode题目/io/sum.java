package leetcode题目.io;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String[] strings=in.nextLine().split(" ");
            int sum=0;
            for (int i=0;i<strings.length;i++){
                sum=sum+Integer.parseInt(strings[i]);
            }
            System.out.println(sum);
        }
        System.out.println("测试结束");
    }
}
