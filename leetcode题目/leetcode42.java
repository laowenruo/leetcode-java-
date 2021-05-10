package leetcode题目;

import org.junit.Test;

import java.util.Stack;

public class leetcode42 {
    static class Solution {
        public int trap(int[] height) {
            int max=getMax(height);
            int sum=0;
            for (int i=1;i<=max;i++){
                boolean flag=false;
                int temp=0;
                for (int j=0;j< height.length;j++){
                    if (height[j]<i&&flag){
                        temp++;
                    }
                    if (height[j]>=i) {
                        sum=sum+temp;
                        temp=0;
                        flag=true;
                    }
                }
            }
            return sum;
        }
        public  static  int getMax(int[] height){
           int temp=0;
           for (int i=0;i< height.length;i++){
               temp=Math.max(temp,height[i]);
           }
           return temp;
        }
        public int trap1(int[] height) {
            int num=0;
            for (int i=1;i< height.length-1;i++){
                int left_max=0;
                int right_max=0;
                int middle=0;
                for (int j=i;j>=0;j--){
                    left_max=Math.max(height[j],left_max);
                }
                for (int j=i;j< height.length;j++){
                    right_max=Math.max(height[j],right_max);
                }
                middle=Math.min(left_max,right_max);
                if (middle>height[i]){
                    num=num+middle-height[i];
                }
            }
            return num;
        }
        public int trap2(int[] height) {
            if (height == null) {
                return 0;
            }
            Stack<Integer> stack = new Stack<>();
            int ans = 0;
            for (int i = 0; i < height.length; i++) {
                while (!stack.isEmpty()&&height[stack.peek()]<height[i]){
                    int curindex=stack.pop();
                    while (!stack.isEmpty()&&height[curindex]==height[stack.peek()]){
                        stack.pop();
                    }
                    if (!stack.isEmpty()){
                        int index=stack.peek();
                        ans=ans+(Math.min(height[i],height[index])-height[curindex])*(i-index-1);
                    }
                }
                stack.add(i);
            }
            return ans;
        }
    }

}
