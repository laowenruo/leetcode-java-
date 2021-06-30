package leetcode;

public class leetcode461 {
    public static int hammingDistance(int x, int y) {
                int xor = x ^ y;
                int distance = 0;
                while (xor != 0) {
                    if (xor % 2 == 1)
                        distance += 1;
                    xor = xor >> 1;
                }
                return distance;
            }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }

}
