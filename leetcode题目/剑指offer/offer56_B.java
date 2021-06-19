package leetcode题目.剑指offer;

import java.util.HashMap;

public class offer56_B {
    public int singleNumber(int[] nums) {
      if (nums.length==1) return nums[0];
        HashMap<Integer,Integer> hashMap=new HashMap();
        for (int num : nums) {
           if (!hashMap.containsKey(num)) hashMap.put(num,1);
           else hashMap.put(num,hashMap.get(num)+1);
        }
        for (int num : nums){
            if (hashMap.get(num)==1) return num;
        }
        return -1;
    }
}
