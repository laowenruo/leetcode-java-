package baidu;

import java.util.HashMap;

public class Solution {
    public static int jump(int n,int[] nums){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int count=0;//次数
        int index=0;
        for (int i=0;i<n;i++) hashMap.put(nums[i],i);
        while (index!=(n-1)){
            if (hashMap.get(nums[index])>index){  //如果后续下标大于才跳转
                index=hashMap.get(nums[index]);
                count++;
                continue; //进行判断并循环
            }
            else{
                index++;
                count++;
            }
        }
        return count;
    }

    public static int force(int n,int[] nums){
        int count=0;
        int temp=0;
        int index=0;
        while (index!=n-1){
            temp=index;
            for (int j=index+1;j<n;j++){
                if (nums[index]==nums[j]) {temp=j; break;}
            }
            if (temp!=index) {
                index=temp;
                count++;
            }
            else {
                count++;
                index++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{3,1,2,3};
        System.out.println(force(4, nums));
    }
}
