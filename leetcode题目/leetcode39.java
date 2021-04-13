package leetcode题目;

import java.util.ArrayList;
import java.util.List;

public class leetcode39 {
    public List<List<Integer>> lists;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length == 0 || target < 0){
            return lists;
        }
        List<Integer> list=new ArrayList<>();
        dfs(0,candidates,target,list);
        return lists;
    }
    public void dfs(int start,int[] candidates,int target,List<Integer> list){
        if (target<0) return;
        if (target==0){
            lists.add(new ArrayList<>(list));
        }
        for (int i=start;i<candidates.length;i++){
            if (target-candidates[i]>0){
                list.add(candidates[i]);
            }
            dfs(start,candidates,target-candidates[i],list);
            list.remove(list.size()-1);
        }
    }
}
