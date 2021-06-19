package leetcode题目.ListNode.剑指offer;

public class offer10_A {
    public int fib(int n) {
    if (n<=1) return n;
    int a=0,b=1;
    int sum=0;
    for (int i=0;i<n;i++){
        sum=(a+b)%1000000007;
        a=b;
        b=sum;
    }
    return a;
    }
}
