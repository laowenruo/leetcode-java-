package pratice.one.one;

import org.junit.Test;

import java.util.ArrayList;

public class ncJZ19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int l=0,r=matrix[0].length-1,t=0,b=matrix.length-1;
        ArrayList<Integer> list = new ArrayList();
        while (l<=r&&t<=b){
            for (int i=l;i<=r;i++) {
                list.add(matrix[t][i]);
            }
            for (int i=t+1;i<=b;i++){
                list.add(matrix[i][r]);
            }
            if (t!=b){
                for (int i=r-1;i>=l;i--){
                    list.add(matrix[b][i]);
                }
            }
            if (l!=r){
                for (int i=b-1;i>=t;i--){
                    list.add(matrix[i][l]);
                }
            }
            ++t;--r;--b;++l;
        }
        return list;
    }
    @Test
    public void test(){
        printMatrix(new int[][]{{1},{2},{3},{4}});
    }
}
