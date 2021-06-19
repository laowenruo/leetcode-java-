package leetcode题目.剑指offer;

public class offer65 {
    public int add(int a, int b) {
       while (b!=0){
           int plus=a^b;
           b=(a&b)<<1;
           a=plus;
       }
       return a;
    }
}
