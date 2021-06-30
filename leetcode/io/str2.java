package leetcode.io;

import java.util.Arrays;
import java.util.Scanner;

public class str2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String[] strings=in.nextLine().split(",");
            Arrays.sort(strings);
            int n=strings.length;
            for (int i=0;i<n-1;i++){
                System.out.print(strings[i]+",");
            }
            System.out.print(strings[n-1]);
            System.out.println();
        }
        in.close();
    }
}
