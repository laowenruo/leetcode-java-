package leetcode.ListNode1.leetcode题目;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class leetcode46 {
    HashSet<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, lists, list);
        return lists;
    }

    public void dfs(int[] nums, List<List<Integer>> lists, List<Integer> list) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
        }
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
                dfs(nums, lists, list);
                list.remove(list.size() - 1);
            }
        }
    }

    @Test
    public void testS() {
        System.out.println(subsetsWithDup(new int[]{2, 2, 3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs1(0, nums, lists, list);
        return lists;
    }

    public void dfs1(int index, int[] nums, List<List<Integer>> lists, List<Integer> list) {
        if (list.size() <= nums.length) lists.add(new ArrayList<>(list));
        else return;
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            dfs1(i + 1, nums, lists, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        dfs2(0, nums, lists, list);
        return lists;
    }

    public void dfs2(int index, int[] nums, List<List<Integer>> lists, List<Integer> list) {
        if(!set.contains(list)){
            lists.add(new ArrayList<>(list));
            set.add(new ArrayList<>(list));
        }
        for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                dfs2(i + 1, nums, lists, list);
                list.remove(list.size() - 1);
        }
    }
}
