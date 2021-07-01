package pratice.one.one;

public class ncJZ12 {
    public double Power(double base, int exponent) {
        boolean flag=false;
        if (exponent<0){
            exponent=-exponent;
            flag=true;
        }
        double result=pow(base,exponent);
        return flag?1/result:result;
    }

    private double pow(double base, int exponent) {
        if (exponent==0){
            return 1;
        }
        if (exponent==1){
            return base;
        }
        double result=pow(base,exponent/2);
        result=result*result;
        if (exponent%2!=0){
            result=result*base;
        }
        return result;
    }

}
