package SearchMaze;

public class ConstantValue {
    public static final int M = 11;
    public static final int N = 10;

    public static final int[] ROW = {-1, 0, 0, 1};
    public static final int[] COL = {0, -1, 1, 0};

    public static final int SRC = 3;
    public static final int DIST = 4;

    public static final int[][] MAT = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {3, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
            {1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
            {1, 0, 1, 1, 0, 0, 0, 0, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 0, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 1, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 4, 1},
    };
}
