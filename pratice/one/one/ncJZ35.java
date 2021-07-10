package pratice.one.one;

public class ncJZ35 {
    private long cnt=0;
    private int[] tmp;

    public int InversePairs(int [] array) {
        tmp=new int[array.length];
        mergeSort(array,0,array.length-1);
        return (int) (cnt%1000000007);
    }

    private void mergeSort(int[] array, int l, int h) {
        if (h-l<1){
            return;
        }
        int mid=l+(h-l)/2;
        mergeSort(array,l,mid);
        mergeSort(array,mid+1,h);
        merge(array,l,mid,h);
    }

    private void merge(int[] array, int l, int mid, int h) {
        int i=l,j=mid+1,k=l;
        while (i<=mid || j<=h){
            if (i>mid){
                tmp[k]=array[j++];
            }else if (j>h){
                tmp[k]=array[i++];
            }else if (array[i]<=array[j]){
                tmp[k]=array[i++];
            }else {
                tmp[k]=array[j++];
                cnt=cnt+mid-i+1;
            }
            k++;
        }
        for (k=l;k<=h;k++){
            array[k]=tmp[k];
        }
    }
}
