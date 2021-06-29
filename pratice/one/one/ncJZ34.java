package pratice.one.one;

public class ncJZ34 {
    public int FirstNotRepeatingChar(String str) {
        int[] chars=new int[128];
        char[] chars1 = str.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            chars[chars1[i]]++;
        }
        for (int i = 0; i < chars1.length; i++) {
            if (chars[chars1[i]]==1){
                return i;
            }
        }
        return -1;
    }
}
