package pratice.one.one;

public class ncJZ7 {
    public int Fibonacci(int n) {
        if (n<0){
            return -1;
        }
        if (n==0||n==1){
            return n;
        }
        int[] nums=new int[n];
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i-1]+nums[i-2];
        }
        return nums[n-1];
    }
}
