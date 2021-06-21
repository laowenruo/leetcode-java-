package leetcode.ListNode1.leetcode题目;

public class leetcode48 {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        //上下交换
        for (int i=0;i<=n/2;i++){
            for (int j=0;j<m;j++){
                swap(i,j,n-i-1,j,matrix);
            }
        }
        //对角线交换
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                swap(i,j,j,i,matrix);
            }
        }
    }
    public void swap(int i,int j,int n,int m,int[][] nums){
        int temp=nums[i][j];
        nums[i][j]=nums[n][m];
        nums[n][m]=temp;
    }
}
