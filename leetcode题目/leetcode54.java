package leetcode题目;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length==0) return new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int top=0,left=0,right= matrix[0].length-1,bottom= matrix.length-1;
        int[] res = new int[(right+1)*(bottom+1)];
        while (true){
            for (int i=left;i<=right;i++) list.add(matrix[top][i]);
            if (++top>bottom) break;  //左到右
            for (int i=top;i<=bottom;i++) list.add(matrix[i][right]);
            if (--right<left) break; //上到下
            for (int i=right;i>=left;i--) list.add(matrix[bottom][i]);
            if (top>--bottom) break; //右到左
            for (int i=bottom;i>=top;i--) list.add(matrix[i][left]);
            if (++left>right) break; //下到上
        }
        return list;
    }
    public List<Integer> spiralOrder1(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        while (true){
            for (int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            if (++top>bottom) break;
            for (int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            if (--right<left) break;
            for (int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            if (top>--bottom) break;
            for (int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            if (++left>right) break;
        }
        return list;
    }
}
