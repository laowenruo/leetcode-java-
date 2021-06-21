package leetcode.ListNode1.leetcode题目;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class leetcode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        for (int i=0;i<n;i++){
            int temp=nums1[i];
            int index=0;
            while (index!=m){
                if (nums2[index]==temp){
                    break;
                }
                index++;
            }
            if (index==(m-1)){
                continue;
            }
            for (int j=index+1;j<m;j++){
                if (nums2[j]>temp){
                    res[i]=nums2[j];
                    break;
                }
            }
        }
        return res;
    }
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] result=new int[nums1.length];
        for (int i : nums1) {
            map.put(i,-1);
        }
        for (int i=nums2.length-1;i>=0;i--){
            while (!stack.isEmpty()&&stack.peek()<=nums2[i]){
                stack.pop();
            }
            if (map.containsKey(nums2[i])){
                int a=stack.isEmpty()?-1:stack.peek();
                map.put(nums2[i], a);
            }
            stack.push(nums2[i]);
        }
        for (int i= 0;i< nums1.length;i++){
            result[i]=map.get(nums1[i]);
        }
        return result;
    }

        @Test
    public void test_(){
        for (int i : nextGreaterElement1(new int[]{4, 1, 2}, new int[]{1, 2, 3, 4})) {
            System.out.print(i+" ");
        }
    }
}
