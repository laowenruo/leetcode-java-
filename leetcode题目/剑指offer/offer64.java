package leetcode题目.剑指offer;

import org.junit.Test;

public class offer64 {
    int result=0;
    public int sumNums(int n) {
        boolean falg=n>1&&sumNums(n-1)>0;  //辅助，符合条件才继续递归
        result+=n;
        return result;
    }
    @Test
    public void test(){
        System.out.println(sumNums(3));
    }
}
