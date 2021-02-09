package PAT.乙级;

import java.util.Scanner;

public class tip03 {
    public static boolean isPrime(int num) {
        //两个较小数另外处理
        if(num==2 || num==3) {
            return true;
        }

        //不在6的倍数两侧的一定不是素数
        if(num%6!=1 && num%6!=5) {
            return false;
        }

        int tmp = (int) Math.sqrt(num);//获取平方根
        //在6的倍数两侧的也可能不是素数
        for(int i=5; i<=tmp; i+=6) {
            if(num%i==0 || num%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a==0) return;
        int flag = 0, flag1 = 0;
        int[] num = new int[10001];
        for (int i = 2; i <= Integer.MAX_VALUE && flag <= b; i++) {
            if (isPrime(i)) {
                num[flag++] = i;
            }
        }

        for (int j = a; j <= b; j++) {
                if (++flag1 % 10 != 0 && j != b) System.out.print(num[j-1] + " ");
                else System.out.println(num[j-1]);
            }

        }
    }

