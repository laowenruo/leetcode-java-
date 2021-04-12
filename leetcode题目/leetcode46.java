package leetcode题目;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode46 {
    List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        dfs(nums,0,list);
        return lists;
    }
    public void dfs(int[] nums,int n,List<Integer> list){
        if (n==nums.length){
            lists.add(list);
            list.clear();
            return;
        }
        for (int i=n;i<nums.length;i++){
            for (int j=n;j< nums.length;j++){
                list.add(nums[j]);
                dfs(nums,n+1,list);
            }
        }
    }
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    @Test
    public void testS(){
        System.out.println(permute(new int[]{1, 2, 3}));
    }
}
