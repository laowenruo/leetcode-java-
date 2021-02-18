import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[800];
        int[] temp = new int[nums.length];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(8000);
        }
        new MergeSort().mergeSort(nums,0, nums.length-1, temp);
        //归并排序代码
        for (int s : nums) {
            System.out.print(s+" ");
        }
    }
    public void mergeSort(int[] nums,int left,int right,int[] temp){
        if (left>=right) return;
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid, temp);
        mergeSort(nums, mid+1, right, temp);
        merge(nums, left,mid,right, temp);
    }
    public void merge(int[] nums,int left,int mid,int right,int[] temp){
       int m=left;
       int i=left;
       int j=mid+1;
       while (i<=mid&&j<=right){
         if (nums[i]<=nums[j]) temp[m++]=nums[i++];
         else temp[m++]=nums[j++];
       }
       while (j<=right) temp[m++]=nums[j++];
       while (i<=mid)   temp[m++]=nums[i++];
        for (int i1 = left; i1 <= right; i1++) {
            nums[left++]=temp[i1];
        }
    }

}
