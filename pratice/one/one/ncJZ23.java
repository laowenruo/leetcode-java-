package pratice.one.one;

public class ncJZ23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence==null||sequence.length==0){
            return false;
        }
        return verify(sequence,0,sequence.length-1);
    }
//4,8,6,12,16,14,10

    /**
     *       10
     *     6     14
     *   4   8  12  16
     */
    private boolean verify(int[] sequence, int first, int last) {
        if (last-first<=1){
            return true;
        }
        int rootVal=sequence[last];
        int index=first;
        while (index<last&&sequence[index]<=rootVal) {
            index++;
        }
        for (int i=index;i<last;i++){
                if (sequence[i]<rootVal){
                    return false;
                }
        }

        return verify(sequence,first,index-1)&&verify(sequence,first,last-1);
    }
}
