public class offer17 {
    public int[] printNumbers(int n) {
        int length= (int) (Math.pow(10,n)-2);
        int[] result=new int[length];
        for (int i=0;i<length;i++){
            result[i]=i+1;
        }
        return result;
    }
}
