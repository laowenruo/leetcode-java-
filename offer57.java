import java.util.ArrayList;

public class offer57 {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> list=new ArrayList<>();
        if (target==1) return new int[][]{{1}};
     int j=1;
     int sum=0;
     for (int i=1;i<=target;i++){
         sum+=i;
         while (sum>target) sum=sum-(j++);
         if (sum==target) {
             //添加结果
             int[] temp=new int[j];
             for (int n=j;n<=i;n++) temp[(n-j)+1]=n;
             list.add(temp);
         }
         if (i==j&&i!=1) list.add(new int[]{target});
     }
        int[][] res = new int[list.size()][];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
