package leetcode题目.ListNode.leetcode题目;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class leetcode862 {
        public int shortestSubarray(int[] A, int K) {
            int sum = 0, result = Integer.MAX_VALUE;
            TreeMap<Integer, Integer> map = new TreeMap<>();
            map.put(0, -1);
            for (int i = 0; i < A.length; i++) {
                sum += A[i];
                Map.Entry<Integer, Integer> floorEntry = map.floorEntry(sum - K);
                if (floorEntry != null && i - floorEntry.getValue() < result)
                    result = i - floorEntry.getValue();
                while (map.size() > 0 && map.lastKey() > sum) map.pollLastEntry();
                map.put(sum, i);
            }
            return result == Integer.MAX_VALUE ? -1 : result;
        }
        @Test
    public void test(){
            System.out.println(shortestSubarray(new int[]{2,-1,2},3));
    }
}
