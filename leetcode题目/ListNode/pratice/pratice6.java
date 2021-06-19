package leetcode题目.ListNode.pratice;

import java.util.HashSet;
import java.util.Objects;

public class pratice6 {
    private int i=0;
    public pratice6(int i){
        this.i=i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof pratice6)) return false;
        pratice6 pratice6 = (leetcode题目.ListNode.pratice.pratice6) o;
        return i == pratice6.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    public static void main(String[] args) {
        HashSet<pratice6> hashSet=new HashSet<>();
        pratice6 a=new pratice6(61);
        pratice6 b=new pratice6(61);
        hashSet.add(a);
        hashSet.add(b);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(hashSet.size());
    }
}
