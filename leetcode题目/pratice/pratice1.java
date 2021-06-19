package leetcode题目.pratice;

import java.util.ArrayList;
import java.util.List;

public class pratice1 {
    private List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        dfs(list,nums);
        return result;
    }
    public void dfs(List<Integer> list,int[] nums){
        if (list.size()== nums.length){
            result.add(new ArrayList<>(list));
        }
        for (int i=0;i< nums.length;i++){
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            dfs(list,nums);
            list.remove(list.size()-1);
        }
    }
}
