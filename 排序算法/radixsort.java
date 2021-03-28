package 排序算法;

import org.junit.Test;

public class radixsort {
    public int[] radixsort(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 1;//最高位数
        int[][] temp = new int[10][nums.length]; //临时数组
        int[] temp_length = new int[10];//定义存放个数
        for (int i = 0; i < nums.length; i++) { //求出最大值
            if (nums[i] > max) max = nums[i];
        }
        while (max != 0) {
            max = max / 10;
            count++;
        }
        for (int i = 0,n=1; i < count; i++,n=n*10) //控制循环次数
        {
            for (int j = 0; j < nums.length; j++) {
                int index = nums[j]/n % 10; //下标
                temp[index][temp_length[index]++] = nums[j];
            }
            int index = 0;
            for (int j = 0; j < temp_length.length; j++) {
                if (temp_length[j] != 0) {
                    for (int k = 0; k < temp_length[j]; k++)
                        nums[index++] = temp[j][k];
                }
                temp_length[j]=0;
            }
        }
        return nums;
    }
    @Test
    public void test(){
        int[] nums=new int[]{1,5,7,2,1,5,7,4,6};
        for (int i : radixsort(nums)) {
            System.out.println(i);
        }
    }
}
