package leetcode.剑指offer;

import java.util.ArrayList;

public class offer62 {
    public int lastRemaining(int n, int m) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<n;i++) list.add(i);
        int p=0;
        while (list.size()!=1){
            p=((p+2)%list.size());
            list.remove(p);
        }
        return list.get(0);
    }
}
