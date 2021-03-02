package SearchMaze;

import java.util.ArrayDeque;
import java.util.Queue;

import static SearchMaze.ConstantValue.*;

public class BFSSearchMaze {


    private int[] findPosition(int[][] mat, int value) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == value) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }

    private boolean isValid(int[][] mat, boolean[][] visited, int row, int col) {
        return (row >= 0) && (row < M) && (col >= 0) && (col < N)
                && mat[row][col] != 1 && !visited[row][col];
    }



    public void BFS(int[][] mat, int source, int dists) {
        // construct a matrix to keep track of visited cells
        boolean[][] visited = new boolean[M][N];
        int[] positionStart = findPosition(mat, source);
        int[] positionDist = findPosition(mat, dists);

        int rowStart = positionStart[0];
        int colStart = positionStart[1];

        int rowDist = positionDist[0];
        int colDists = positionDist[1];

        // create queue
        Queue<Node> q = new ArrayDeque<>();

        // mark the source cell as visited and enqueue the source node
        visited[rowStart][colStart] = true;
        q.add(new Node(rowStart, colStart, 0));

        // stores length of the longest path from source to destination
        int min_dist = Integer.MAX_VALUE;

        // loop till queue is empty
        while (!q.isEmpty()) {
            // dequeue front node and process it
            Node node = q.poll();

            // minimum distance from the source
            rowStart = node.x;
            colStart = node.y;
            int dist = node.dist;

            // if the destination is found, update `min_dist` and stop
            if (rowStart == rowDist && colStart == colDists) {
                min_dist = dist;
                break;
            }

            // check for all four possible movements from the current cell
            // and enqueue each valid movement
            for (int k = 0; k < 4; k++) {
                int sumRowStart = rowStart + ROW[k];
                int sumColStart = colStart + COL[k];

                if (isValid(mat, visited, sumRowStart, sumColStart)) {
                    // mark next cell as visited and enqueue it
                    visited[sumRowStart][sumColStart] = true;
                    q.add(new Node(sumRowStart, sumColStart, dist + 1));
                }
            }
        }

        if (min_dist != Integer.MAX_VALUE) {
            System.out.print("The shortest path from source to destination " +
                    "has length " + min_dist);
        } else {
            System.out.print("Destination can't be reached from a given source");
        }
    }

//    public static void main(String[] args) {
//        System.out.println("**************** BFS Search for Maze ****************");
//        BFSSearchMaze BFSSearchMaze = new BFSSearchMaze();
//        BFSSearchMaze.BFS(MAT, SRC, DIST);
//
//
//    }
}
