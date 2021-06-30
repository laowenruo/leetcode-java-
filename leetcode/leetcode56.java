package leetcode;

import java.util.Arrays;

public class leetcode56 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals,((o1, o2) -> o1[0]-o2[0]));
            int[][] nums=new int[intervals.length][2];
            int index=-1;
            for (int[] interval : intervals) {
                if (index==-1||interval[1]<nums[index][1]){
                    nums[++index]=interval;
                }
                else {
                    nums[index][1]=Math.max(interval[1],nums[index][1]);
                }
            }
            return nums;
        }
    }
}
