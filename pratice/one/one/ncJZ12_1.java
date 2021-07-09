package pratice.one.one;

public class ncJZ12_1 {
    private final static int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int rows;
    private int cols;

    public boolean hasPath (String val, int rows, int cols, String path) {
        if (rows == 0 || cols == 0) return false;
        this.rows = rows;
        this.cols = cols;
        char[] array = val.toCharArray();
        char[][] matrix = buildMatrix(array);
        char[] pathList = path.toCharArray();
        boolean[][] marked = new boolean[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (backtracking(matrix, pathList, marked, 0, i, j))
                    return true;

        return false;
    }

    private boolean backtracking(char[][] matrix, char[] pathList,
                                 boolean[][] marked, int pathLen, int r, int c) {

        if (pathLen == pathList.length) return true;
        if (r < 0 || r >= rows || c < 0 || c >= cols
                || matrix[r][c] != pathList[pathLen] || marked[r][c]) {

            return false;
        }
        marked[r][c] = true;
        for (int[] n : next)
            if (backtracking(matrix, pathList, marked, pathLen + 1, r + n[0], c + n[1]))
                return true;
        marked[r][c] = false;
        return false;
    }

    private char[][] buildMatrix(char[] array) {
        char[][] matrix = new char[rows][cols];
        for (int r = 0, idx = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                matrix[r][c] = array[idx++];
        return matrix;
    }

    public static void main(String[] args) {
        ncJZ12_1 solution = new ncJZ12_1();
        String val = "ABCESFCSADEE";
        int rows = 3;
        int cols = 4;
        String path = "ABCCED";
        boolean res = solution.hasPath(val, rows, cols, path);
        System.out.println(res);
    }
}