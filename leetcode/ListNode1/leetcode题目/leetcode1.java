package leetcode.ListNode1.leetcode题目;

import java.util.HashMap;

public class leetcode1 {
    public int[] twoSum1(int[] nums, int target) {  //暴力破解
        int[] a=new int[2];
      for (int i=0;i< nums.length;i++){
          for (int j=i+1;j<nums.length;j++){
              if (nums[i]+nums[j]==target)
              {
                  a[0]=i;
                  a[1]=j;
                  break;
              }
          }
      }
      return a;
    }
    public int[] twoSum(int[] nums, int target) {  //  优方案，哈希表key放值，方便判断，哈希表value放下标，
        int[] a=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(target-nums[i])) {
                a[0]=hashMap.get(target-nums[i]);
                a[1]=i;
                break;
            }
            hashMap.put(nums[i],i);
        }
        return a;
    }

}
