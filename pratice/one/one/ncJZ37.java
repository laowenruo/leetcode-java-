package pratice.one.one;
public class ncJZ37 {
    public int GetNumberOfK(int [] array , int k) {
        int low=binarySearch(array,k);
        int high=binarySearch(array,k+1);
        return (low==array.length||array[low]!=k)?0:high-low;
    }
    public int binarySearch(int [] array, int k){
        int low=0,high=array.length;
        while (low<high){
            int m=low+(high-low)/2;
            if (array[m]>=k){
                high=m;
            }else {
                low=m+1;
            }
        }
        return low;
    }
}
