package leetcode.剑指offer;

import java.util.HashMap;

public class offer39 {
    public int majorityElement1(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int temp=nums.length/2;
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])) hashMap.put(nums[i],hashMap.get(nums[i])+1);
            else hashMap.put(nums[i],1);
            if (hashMap.get(nums[i])>temp) return nums[i];
        }
        return  -1;
    }
    public int majorityElement(int[] nums) { //摩尔投票法
        int count=0,major=0,temp=0;
        for (int i=0;i<nums.length;i++){
            if (count==0){
                major=nums[i];
                count=1;
            }
            else {
                count+=(nums[i]==major)?1:-1;
            }
        }
        for (int i=0;i<nums.length;i++){
            if (major==nums[i]) temp++;
            if (temp> nums.length/2) return major;
        }
        return -1;
    }
}
