    package leetcode题目.PAT.乙级;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class tip04 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            char[] str1 = bufferedReader.readLine().toCharArray();
            char[] str2 = bufferedReader.readLine().toCharArray();
            char[] str3 = bufferedReader.readLine().toCharArray();
            char[] str4 = bufferedReader.readLine().toCharArray();
            int min=str1.length;
            boolean flag=true;boolean flag1=false;
            int b=1;
            if (str1.length>=str2.length) min=str2.length;
            String data[]= {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
            for (int i=0;i<=min-1;i++){
                if (str1[i]==str2[i]&&'A'<=str1[i]&&str1[i]<='Z'&&'A'<=str2[i]&&str2[i]<='Z'&&flag) {
                        if (str1[i] == 'A') System.out.print(data[0] + " ");
                        else if (str1[i] == 'B') System.out.print(data[1] + " ");
                        else if (str1[i] == 'C') System.out.print(data[2] + " ");
                        else if (str1[i] == 'D') System.out.print(data[3] + " ");
                        else if (str1[i] == 'E') System.out.print(data[4] + " ");
                        else if (str1[i] == 'F') System.out.print(data[5] + " ");
                        else if (str1[i] == 'G') System.out.print(data[6] + " ");
                        flag=false;
                        flag1=true;
                    }
                else if ('0'<=str1[i]&&str1[i]<='N'&&'0'<=str2[i]&&str2[i]<='N'&&str2[i]==str1[i]&&flag1){
                        if ('0'<=str1[i]&&str1[i]<='9') System.out.print("0"+str1[i]+":");
                        if ('A'<=str1[i]&&str1[i]<='N') System.out.print(str1[i]-'A'+10+":");
                        flag1=false;
                    }
                }
            flag=true;
            min=str3.length;
            if (str3.length>=str4.length) min=str4.length;
            for (int i=0;i<=min-1&&flag;i++){
                if (('A'<=str3[i]&&str3[i]<='Z'||'a'<=str3[i]&&str3[i]<='z')&&('A'<=str4[i]&&str4[i]<='Z'||'a'<=str4[i]&&str4[i]<='z')) {
                    if (str3[i]==str4[i]) {
                        if (b < 10) System.out.println("0" + b);
                        else System.out.print(b);
                        flag=false;
                    }
                    b++;
                }

            }
        }
    }
