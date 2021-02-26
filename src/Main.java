import SearchMaze.SearchMaze;
import SearchTree.SearchTree;

import java.util.Arrays;

import static SearchMaze.ConstantValue.*;
import static SearchTree.ConstantValue.VALUES;

public class Main {
    public static void main(String[] args){
        System.out.println("**************** Search Tree ****************");
        SearchTree searchTree = new SearchTree();
        Arrays.stream(VALUES).forEach(searchTree::insert);
        searchTree.print();

        System.out.println();

        System.out.println("**************** BFS Search for Maze ****************");
        SearchMaze searchMaze = new SearchMaze();
        searchMaze.BFS(MAT, SRC, DIST);
    }
}
