import java.util.Random;

public class HeapSort {
    public static void main(String[] args) {
        int[] nums = new int[800];
        Random random = new Random();
        int i;
        for (i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(8000);
        }
        sort(nums);
        for (int s : nums) {
            System.out.print(s+" ");
        }

    }
    public static void sort(int[] nums){
        for (int i=nums.length/2-1;i>=0;i--){
            adjust(nums,i,nums.length); //初始堆
        }
        for (int j=nums.length-1;j>=0;j--){
            int temp=nums[j];
            nums[j]=nums[0];
            nums[0]=temp;
            adjust(nums,0,j); //不断调整堆
        }
    }

    private static void adjust(int[] nums, int i, int j) {
        int temp=nums[i];//取出元素
        for (int m=i*2+1;m<j;m=m*2+1){
            if (m+1<j&&nums[m]<nums[m+1]) m++;
            if (nums[m]>temp) {
                nums[i]=nums[m];
                i=m;
            }else {
                break;
            }
            nums[i]=temp;
        }
    }
}
