package pratice.one.one;

public class ncJZ6 {
    //4  5  6  1  2  3
    //4  5  6  7  8  1
    //1  2  3  4  5  6
    public int minNumberInRotateArray(int [] array) {
        if (array==null||array.length==0){
            return 0;
        }
        int low=0,high=array.length-1;
        while (low<high){
            int mid=low+(high-low)/2;
            if (array[low]==array[mid]&&array[mid]==array[high]){
                return minNumber(array,low,high);
            }else if (array[mid]<=array[high]) {
                high = mid;
            }
            else {
                low=mid+1;
            }
        }
        return array[low];
    }

    private int minNumber(int[] array, int low, int high) {
        for (int i=low;i<high;i++){
            if (array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return array[low];
    }
}
