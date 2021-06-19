package leetcode题目.剑指offer;

public class offer58 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder str=new StringBuilder(s);
        str.append(str.substring(0,n));
        str.delete(0,n);
        return String.valueOf(str);
    }
}
