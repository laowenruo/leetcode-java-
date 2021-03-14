package 剑指offer;

import java.util.HashSet;

public class offer03 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (hashSet.contains(nums[i])) return nums[i];
            else hashSet.add(nums[i]);
        }
        return -1;
    }
}
