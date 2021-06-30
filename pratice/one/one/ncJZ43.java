package pratice.one.one;

public class ncJZ43 {
    public String LeftRotateString(String str,int n) {
        if (n>str.length()){
            return "";
        }
        if (n==str.length()){
            return str;
        }
        char[] chars = str.toCharArray();
        swap(chars,0,n-1);
        swap(chars,n,str.length()-1);
        swap(chars,0,str.length()-1);
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
}
