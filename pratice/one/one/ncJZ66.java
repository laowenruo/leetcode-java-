package pratice.one.one;

public class ncJZ66 {
    int rows;
    int cols;
    int index=0;
    public int movingCount(int threshold, int rows, int cols) {
        this.cols=cols;
        this.rows=rows;
        int[][] nums=new int[rows][cols];
        boolean[][] flag=new boolean[rows][cols];
        run(threshold,0,0,flag);
        return index;
    }

    public void run(int threshold,int i,int j,boolean[][] flag){
        if (calculate(i,j)>threshold||i<0||j<0||j>=cols||i>=rows||flag[i][j]){
            return;
        }
        flag[i][j]=true;
        index++;
        run(threshold,i-1,j,flag);
        run(threshold,i+1,j,flag);
        run(threshold,i,j-1,flag);
        run(threshold,i,j+1,flag);
    }
    public int calculate(int nums,int nums1){
        return getNum(nums)+getNum(nums1);
    }
    public int getNum(int nums){
        int temp=0;
        while (nums!=0){
            temp=temp+nums%10;
            nums=nums/10;
        }
        return temp;
    }
}
