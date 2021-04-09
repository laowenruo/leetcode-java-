package io;

import java.util.*;

public class str1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String[] strings=in.nextLine().split(" ");
            Arrays.sort(strings);
            for (String string : strings) {
                System.out.println(string);
            }
        }
        in.close();
    }
}
