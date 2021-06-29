package pratice.one.one;

import org.junit.Test;

public class ncJZ44 {
    public String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        int pre=0;
        for (int i = 0; i <chars.length; i++) {
            if (chars[i]==' '){
                swap(chars,pre,i-1);
                pre=i+1;
            }else if (i==chars.length-1){
                swap(chars,pre,i);
            }
        }
        swap(chars,0, chars.length-1);
        return new String(chars);
    }
    public void swap(char[] chars,int i,int j){
        while (i<j){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;j--;
        }
    }
    @Test
    public void test(){
        System.out.println(ReverseSentence("I am a student."));
    }
}
