package leetcode.ListNode1.PAT.乙级;
import java.util.Scanner;

public class tip02{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int temp;
        int a=0,b=0,c=0,d=0,e=0;
        int flag=1;
        double number=0;
        double result=0;
        for(int i=1;i<=N;i++)
        {
            temp=scan.nextInt();
            if(temp%5==0&&temp%2==0) {a+=temp;}
            else if(temp%5==1) {if(flag++%2==1) b+=temp; else b-=temp;}
            else if(temp%5==2) {c++;}
            else if(temp%5==3) {d+=temp; number++;}
            else if(temp%5==4) {e=e>temp?e:temp;}
        }
        if(a==0) System.out.print("N"+" "); else System.out.print(a+" ");
        if(b==0) System.out.print("N"+" "); else System.out.print(b+" ");
        if(c==0) System.out.print("N"+" "); else System.out.print(c+" ");
        if(d==0) System.out.print("N"+" "); else System.out.print(String.format("%.1f",result=(d/number))+" ");
        if(e==0) System.out.print("N"); else System.out.print(e);
    }
}