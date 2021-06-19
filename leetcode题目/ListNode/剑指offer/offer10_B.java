package leetcode题目.ListNode.剑指offer;

public class offer10_B {
    public int numWays(int n) {         //a b
        int a = 1, b = 1, sum;          //1 1 2 3 5
        for(int i = 0; i < n; i++){  //下标0 1 2 3 4
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
