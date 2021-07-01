package pratice.one.one;

public class ncJZ67 {
    public int cutRope(int target) {
        if (target<2){
            return 0;
        }
        if (target==2){
            return 1;
        }
        if (target==3){
            return 2;
        }
        int n=target/3;
        if (target-n*3==1){
            n--;
        }
        int temp=(target-n*3)/2;
        return (int)(Math.pow(3,n))*(int)(Math.pow(2,temp));
    }
}
