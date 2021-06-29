package pratice.one.one;

import java.util.Stack;

public class ncJZ21 {
    Stack<Integer> stack=new Stack<>();
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int index=0;
        for (int i=0;i< pushA.length;i++){
            stack.push(pushA[i]);
            while (!stack.isEmpty()&&stack.peek()==popA[index]){
                stack.pop();
                index++;
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
