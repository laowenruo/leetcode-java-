public class offer49 {
    public int nthUglyNumber(int n) {
        if(n<=0) return -1;
        int[] ugly=new int[n];
        ugly[0]=1;
        int i2=0,i3=0,i5=0;
        for (int i=1;i<n;i++){
            ugly[i]=Math.min(ugly[i2]*2,Math.min(ugly[i3]*3,ugly[i5]*5));
            if (ugly[i2]*2==ugly[i]) i2=i2+1;
            if (ugly[i3]*3==ugly[i]) i3=i3+1;
            if (ugly[i5]*5==ugly[i]) i5=i5+1;
        }
        return ugly[n-1];
    }
}
