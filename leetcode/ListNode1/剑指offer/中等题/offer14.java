package leetcode.ListNode1.剑指offer.中等题;

public class offer14 {
    public int cuttingRope(int n) {
        int maxmultiply = 1;
        if (n <= 0) return 0;
        else if (n == 1 || n == 2) return 1;
        else if (n == 3) return 2;
        else if (n >= 4) {
        int temp=n/3;
         if (n%3==0) return (int) Math.pow(3,temp);
         if (n%3==1) return (int) Math.pow(3,temp-1)*4;
         if (n%3==2) return (int) Math.pow(3,temp)*2;
        }
        return -1;
    }
}
