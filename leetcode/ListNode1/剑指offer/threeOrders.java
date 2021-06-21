package leetcode.ListNode1.剑指offer;

import leetcode.ListNode1.剑指offer.中等题.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class threeOrders{
    public static void main(String[] args) {
//        Solution solution=new Solution();
//        System.out.println(solution.JumpFloor(10));
//        int[] A=new int[20];
//        int[] B=new int[]{1,2,6,8,9};
//        for (int i=0;i<=5;i++) A[i]=i+2;
//        merge(A,6,B,5);
//        for (int i : A) {
//            if (A[i]!=0)
//            System.out.println(i);
//        }
        System.out.println(numWays(44));
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack();
        List<Integer> result=new ArrayList<Integer>();
        if(root==null) return result;
        stack.push(root);//注入根节点
        while(!stack.empty()){
            TreeNode tmp=stack.pop();
            result.add(tmp.val); //节点注入
            if(tmp.left!=null ) stack.push(tmp.left);
            if(tmp.right!=null) stack.push(tmp.right);

        }
        Collections.reverse(result);
        return result;
    }
    public static int numWays(int n) {
        if(n==1||n==0) return 1;
        int[] result=new int[n+1];
        result[0]=1;
        result[1]=1;
        for(int i=2;i<=n;i++){
            result[i]=result[i-1]+result[i-2];
        }
        return result[n];
    }
    public static void merge(int A[], int m, int B[], int n) {
        int length=m+n; //合并后所用长度
        int i=m-1,j=n-1,index=length-1;//各数组下标
        while(i!=0&&j!=0){
            if(A[i]>=B[j]) A[index--]=A[i--];
            else A[index--]=B[j--];
        }
        while(j!=0) A[index--]=B[j--];
        while(i!=0) A[index--]=A[i--];
    }
    static class Solution {
        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            if(k>input.length) return new ArrayList<Integer>();
            sortpartition(input,0,input.length-1);
            ArrayList<Integer> result=new ArrayList<>();
            result.size();
            for(int i=0;i<k;i++) result.add(input[i]);
            return result;
        }
        public void sortpartition(int[] input,int left,int right) {
            if (left < right) {
                int temp = input[right]; //基准值
                int i = left, j = right;//循环变量
                while (i < j) {
                    while (i < j && input[i] <= temp) i++;
                    input[j] = input[i];
                    while (i < j && input[j] >= temp) j--;
                    input[i] = input[j];
                }
                input[i] = temp;
                sortpartition(input, left, i - 1);
                sortpartition(input, i + 1, right);
            }
        }
        public int JumpFloor(int target) {
            if(target<=2) return target;
            int[] result=new int[target+1];
            result[0]=1;
            result[1]=1;
            for(int i=2;i<=target;i++){
                result[i]=result[i-1]+result[i-2];
            }
            return result[target];
        }
    }
}