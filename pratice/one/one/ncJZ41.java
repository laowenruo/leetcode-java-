package pratice.one.one;

import java.util.ArrayList;

public class ncJZ41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        int start=1,end=2;
        int curSum=3;
        while (end<sum){
            if (curSum>sum){
                curSum-=start;
                start++;
            }else if (curSum<sum){
                end++;
                curSum+=end;
            }else {
                ArrayList<Integer> list=new ArrayList<>();
                for (int i=start;i<=end;i++){
                    list.add(i);
                }
                lists.add(list);
                curSum-=start;
                start++;
                end++;
                curSum+=end;
            }
        }
        return lists;
    }
}
