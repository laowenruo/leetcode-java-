package leetcode.PAT.甲级;

import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int sum=0,day=0;
        for (int i=1;day<N;i++){
             for (int j=1;j<=i&&day<N;j++){
                 sum+=i;
                 day++;
             }
        }
        System.out.println(sum);
    }
}
