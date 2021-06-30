package leetcode;

import java.util.HashMap;

public class leetcode136 {
    public int singleNumber(int[] nums) {
        int temp=0;
        for (int i=0;i<nums.length;i++){
            temp=nums[i]^temp;
        }
        return temp;
    }
    public int singleNumber1(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])){
                hashMap.remove(nums[i],1);
            }
            else {
                hashMap.put(nums[i], 1);
            }
        }
        return hashMap.keySet().iterator().next();
    }
    public int singleNumber2(int[] nums){
        int temp=nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp=temp^nums[i];
        }
        return temp;
    }
}
