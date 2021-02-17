import org.junit.Test;

public class leetcode556 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int i = nums.length, j = nums[0].length; //i代表行，j代表列
        if (r >= i || j >= c) return nums;
        int a = 0, b = 0;
        int[][] result = new int[r][c];
        for (int n = 0; n < r; n++) {
            for (int m = 0; m < c; m++) {
                    if (b == j) {
                        b = 0;
                        a++;
                    }
                    result[n][m] = nums[a][b++];
            }
        }
        return result;
    }
    @Test
    public void  test(){
        int[][] nums={{1,2},{3,4}};
        int[][] result=matrixReshape(nums,1,4);
        System.out.println(result);
    }
}
