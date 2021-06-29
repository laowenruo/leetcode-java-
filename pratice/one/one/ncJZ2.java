package pratice.one.one;

public class ncJZ2 {
    public String replaceSpace (String s) {
        char[] chars = s.toCharArray();
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==' '){
                str.append("%20");
            }
            else {
                str.append(chars[i]);
            }
        }
        return str.toString();
    }
}
