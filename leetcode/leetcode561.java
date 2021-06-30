package leetcode;

import java.util.Arrays;

public class leetcode561 {
    public int arrayPairSum(int[] nums) {
    nums=Arrays.stream(nums).sorted().toArray();
    int sum=0;
    for (int i=0;i< nums.length;i=i+2){
        sum=sum+nums[i];
    }
    return  sum;
    }
}
