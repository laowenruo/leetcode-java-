package 排序算法;

public class heapsort {
    public static int[] heapsort(int[] nums){
        int n= nums.length;
        for (int i = (int) Math.floor(n/2);i>=0;i--){
            heaptosort(nums,i,n);
        }
        for (int i=n-1;n>=0;i--){
            swap(nums,0,i);
            n--;
            heaptosort(nums,0,n);
        }
        return nums;
    }

    private static void heaptosort(int[] nums, int i, int n) {
        int a=2*i+1;
        int b=2*i+2;
        int index_max=i;
        if (a<n&nums[a]>nums[index_max]) index_max=a;
        if (b<n&&nums[b]>nums[index_max]) index_max=b;
        if (index_max!=i){
            swap(nums,i,index_max);
            heaptosort(nums,index_max,n); //调整后续影响
        }
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
