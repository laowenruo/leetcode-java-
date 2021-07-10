package pratice.one.one;

public class ncJZ13 {
    public int[] reOrderArray (int[] array) {
        int index=0;
        for (int i : array) {
            if (i%2!=0){
                index++;
            }
        }
        int j=0;
        int[] copy=array.clone();
        for (int i : array) {
            if (i%2!=0){
                copy[j++]=i;
            }else {
                copy[index++]=i;
            }
        }
        return copy;
    }
    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
