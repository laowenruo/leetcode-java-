import java.util.ArrayList;
import java.util.List;

public class leetcode154 {
    public int findMin(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        list.add(nums[0]);
        for (int i=1;i< nums.length;i++){
            if (nums[i]-nums[i-1]!=1) list.add(nums[i]);
        }
        for (Integer integer : list) {
            if (integer<min) min=integer;
        }
        return min;
    }
}
