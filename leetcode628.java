import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode628 {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int a=nums[0]*nums[1]*nums[n-1];
        int b=nums[n-1]*nums[n-2]*nums[n-3];
        return a>b?a:b;
    }

    public static void main(String[] args) {
        int nums[]={-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
}
