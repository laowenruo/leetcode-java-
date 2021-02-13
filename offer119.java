import java.util.ArrayList;
import java.util.List;

public class offer119 {  //添加注释
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        int[][] a=new int[rowIndex+1][];
        a[0]= new int[]{1};
        a[1]= new int[]{1, 1};
        if (rowIndex==0||rowIndex==1) {for (int c:a[rowIndex]) list.add(c);return list;};
        for (int i=2;i<rowIndex+1;i++){  //存放结果
            a[i]=new int[i+1];
            a[i][0]=1;
            a[i][i]=1;
            for (int j=1;j<i;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for (int c:a[rowIndex]) list.add(c);return list;
    }
}
