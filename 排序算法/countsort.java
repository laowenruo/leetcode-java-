package 排序算法;

public class countsort {
    public static void countsort(int[] nums){
        int n=getMaxValue(nums)+1;
        int[] bucket=new int[n];//桶
        int index=0;
        for (int num : nums) {
            bucket[num]++;
        }
        for (int i=0;i<n;i++){
            while (bucket[i]!=0) nums[index++]=i;
        }
    }

    private static int getMaxValue(int[] nums) {
        int max=nums[0];
        for (int i=1;i< nums.length;i++){
            if (nums[i]>max) max=nums[i];
        }
        return max;
    }
}
