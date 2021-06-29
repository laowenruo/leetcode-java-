package pratice.one.one;

import java.util.ArrayList;
import java.util.Arrays;

public class ncJZ42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int i=0,j=array.length-1;
        while (i<j){
            int temp=array[i]+array[j];
            if (temp==sum){
                return new ArrayList<>(Arrays.asList(array[i],array[j]));
            }
            else if (temp<sum){
                i++;
            }
            else {
                j--;
            }
        }
        return new ArrayList<>();
    }
}
