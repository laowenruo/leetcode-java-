package leetcode.剑指offer;

public class offer29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0) return new int[0];
        int top=0,left=0,right= matrix[0].length-1,bottom= matrix.length-1;
        int[] res = new int[(right+1)*(bottom+1)];
        int temp=0;
        while (true){
            for (int i=left;i<=right;i++) res[temp++]=matrix[top][i];
            if (++top>bottom) break;  //左到右
            for (int i=top;i<=bottom;i++) res[temp++]=matrix[i][right];
            if (--right<left) break; //上到下
            for (int i=right;i>=left;i--) res[temp++]=matrix[bottom][i];
            if (top>--bottom) break; //右到左
            for (int i=bottom;i>=top;i--) res[temp++]=matrix[i][left];
            if (++left>right) break; //下到上
        }
        return res;
    }
}
