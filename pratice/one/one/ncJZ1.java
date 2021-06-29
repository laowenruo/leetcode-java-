package pratice.one.one;

import org.junit.Test;

public class ncJZ1 {

    public boolean Find(int target, int [][] array) {
        if (array==null||array.length==0||array[0].length==0){
            return false;
        }
        int row=0,col=array[0].length-1;
        while (col>=0&&row<=array.length-1){
            if (target==array[row][col]){
                return true;
            }
            else if (target>array[row][col]){
                row++;
            }
            else {
                col--;
            }
        }
        return false;
    }
    @Test
    public void test(){
        System.out.println(Find(2, new int[][]{{1, 1}}));
    }
}
