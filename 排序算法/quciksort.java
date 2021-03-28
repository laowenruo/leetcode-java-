package 排序算法;

import org.junit.Test;

public class quciksort {
    public void sort(int[] nums,int begin,int end){
       partition(nums,0,8);
    }

    private void partition(int[] nums, int begin, int end) {
        if (begin<end) {
            int pivot = youhua(nums, begin, end); //基准值
            int i = begin, j = end - 1;
            while (i < j) {
                while (i < j && nums[i] <= pivot) i++;
                nums[j] = nums[i];
                while (i < j && nums[j] >= pivot) j--;
                nums[i] = nums[j];
            }
            nums[i] = pivot;
            partition(nums, begin, i - 1);
            partition(nums, i + 1, end);
        }
    }
    private int youhua(int[] nums, int begin, int end){
        int mid=(begin+end)/2; //中点
        if (nums[begin]>nums[mid]) swap(nums,begin,mid);
        if (nums[mid]>nums[end]) swap(nums,mid,end);
        if (nums[begin]>nums[mid]) swap(nums,begin,end);
        swap(nums,mid,end-1);//优化
        return nums[end-1];
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    @Test
    public void test(){
        int[] nums=new int[]{1,5,7,2,1,5,7,4,6};
        sort(nums,0,8);
        for (int i : nums) {
            System.out.println(i);
        }
    }
    public static void quicksort1(int[] array,int begin,int end){
        if (end<=begin) return;
        int pivot=partition1(array, begin, end);
        quicksort1(array,begin,pivot-1);
        quicksort1(array,pivot+1,end);
    }
    public static int partition1(int[] array,int begin,int end){
        int pivot=end;
        int counter=begin; //记录位置
        for (int i=begin;i<end;i++){
            if (array[i]<pivot) {
                swap(array,i,counter++);
            }
        }
        swap(array,pivot,counter);
        return counter;
    }
}
