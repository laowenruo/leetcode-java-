package leetcode题目.ListNode.剑指offer;

public class offer15 {
    public int hammingWeight1(int n) {
        return Integer.bitCount(n);//
    }
    public int hammingWeight2(int n) {  //理解位操作,在计算机中其实存的都是二进制的值，位操作只是在微观对二进制位操作
        int count=0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public int hammingWeight3(int n) {  //理解位操作,在计算机中其实存的都是二进制的值，位操作只是在微观对二进制位操作
        int count=0;
        while (n!=0){
            count+=n&1;
            n=n>>1;
        }
        return count;
    }
}
