package leetcode题目.ListNode.leetcode题目;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode39 {
    public List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        if (candidates.length==0){
            return lists;
        }
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0,candidates,target,list);
        return lists;
    }

    private void dfs(int begin, int[] candidates, int target, List<Integer> list) {
        if (target<0){
            return;
        }
        if (target==0){
            lists.add(new ArrayList<>(list));
        }
        for (int i=begin;i<candidates.length;i++){
            if (target-candidates[i]<0){
                continue;
            }
            list.add(candidates[i]);
            dfs(i,candidates,target-candidates[i],list);
            list.remove(list.size()-1);
        }
    }
    @Test
    public void test(){
        dfs(0,new int[]{2,3},7,new ArrayList<>());
    }
}
