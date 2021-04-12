package leetcode题目;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class leetcode556 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int i = nums.length, j = nums[0].length; //i代表行，j代表列
        if (r >= i || j >= c) {
            return nums;
        }
        int a = 0, b = 0;
        int[][] result = new int[r][c];
        for (int n = 0; n < r; n++) {
            for (int m = 0; m < c; m++) {
                    if (b == j) {
                        b = 0;
                        a++;
                    }
                    result[n][m] = nums[a][b++];
            }
        }
        return result;
    }
    public int nextGreaterElement(int n) {
        int[] num=toStr(n);
        Stack<Integer> stack=new Stack<>();
        int min_index=-1;
        for (int i= num.length-1;i>=0;i--){
            while (!stack.isEmpty()&&num[i]<num[stack.peek()]){
                min_index=stack.pop();
            }
            if (min_index!=-1){
                swap(num,min_index,i);
                Arrays.sort(num,i+1,num.length);
                break;
            }
            stack.push(i);
        }
        if (min_index==-1) return -1;
        StringBuilder str=new StringBuilder();
        for (int i=0;i< num.length;i++){
            str.append(num[i]);
        }
        int a=0;
        try {
            a=Integer.valueOf(String.valueOf(str));
        }
        catch (Exception e){
            return -1;
        }
        return a;
    }
    public void swap(int[] numbers,int i,int j){
        int temp=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=temp;
    }
    public int[] toStr(int n){
        int temp=n;
        int length=0;
        while (temp!=0){
            temp=temp/10;
            length++;
        }
        int[] num=new int[length];
        for (int i=length-1;i>=0;i--){
            num[i]=n%10;
            n=n/10;
        }
        return num;
    }
    @Test
    public void  test(){
//        int[][] nums={{1,2},{3,4}};
//        int[][] result=matrixReshape(nums,1,4);
//        System.out.println(result);
        System.out.println(nextGreaterElement(2147483486));
    }
}
