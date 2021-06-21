package leetcode.ListNode1.leetcode题目;

public class leetcode765 {
    public int minSwapsCouples(int[] row) {
     int temp=0; //计数交换次数
     for (int i=0;i<row.length;i=i+2){
         if (row[i]%2==0){
             if (row[i+1]-row[i]==1) continue; //无需交换
             else {                            //需要交换
                 swap(findpeople(row,row[i]+1),i+1,row);
                 temp++;
             }
         }
         else {
             if (row[i]-row[i+1]==1) continue;
             else {
                 swap(findpeople(row,row[i]-1),i+1,row);
                 temp++;
             }
         }
     }
     return temp;
    }
    public int findpeople(int[] row,int temp){
        for (int i=0;i<row.length;i++)
            if (row[i]==temp) return i;
            return -1;
    }
    public void swap(int i,int j,int[] row){
        int temp=row[j];
        row[j]=row[i];
        row[i]=temp;
    }
}
