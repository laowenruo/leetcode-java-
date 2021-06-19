package leetcode题目.wangyi;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class chongdian {
    public int charge(int[] e,int[] c){
        Queue<Integer> queue=new LinkedList();
        int res=0;
        int num=Integer.MAX_VALUE;
        //筛除充完电还跑不到下个点的
        for (int i=0;i<e.length;i++){
            if (e[i]>c[i]) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            //弹出能出发的起点，采用双指针
            int i=queue.poll();
            int j=i;
            //初始油量
            res=e[i];
            do {
                res=res-c[j];
                if (res<0){
                    return -1;
                }
                if (j==e.length-1){
                    j=0;
                }
                res+=e[j];
            }while (i!=j);
            if (i==j) {num=Math.min(num, i);}
        }
        return  num;
    }
    @Test
    public void test(){
        System.out.println(charge(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }
}
