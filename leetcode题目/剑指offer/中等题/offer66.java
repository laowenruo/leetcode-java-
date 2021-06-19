package leetcode题目.剑指offer.中等题;

public class offer66 {
    public int[] constructArr(int[] a) {
        int k=a.length; //获取数组长度
        if (a==null||k<=1) return new int[0];
        int[] result=new int[k];
        result[0]=1; //方便左乘
        for (int i=1;i<k;i++){
            result[i]=result[i-1]*a[i-1];
        }
        int temp=1;//方便右乘
        for (int i=k-2;i>=0;i--){
            temp=temp*a[i+1];
            result[i]=result[i]*temp;
        }
        return result;
    }

}
