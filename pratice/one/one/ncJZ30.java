package pratice.one.one;

public class ncJZ30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0||array==null){
            return -1;
        }
        int sum=Integer.MIN_VALUE;
        int temp=0;
        for (int i = 0; i < array.length; i++) {
            temp=temp+array[i];
            sum=Math.max(temp,sum);
            temp=temp<=0?0:temp;
        }
        return sum;
    }
}
