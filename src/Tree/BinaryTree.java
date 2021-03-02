package Tree;

import static Tree.ConstantValue.COUNT;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    private Node insertNode(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insertNode(root.left, value);
        else if (value > root.value)
            root.right = insertNode(root.right, value);

        return root;
    }

    public void print() {
        print2DUtil(root, 0);
    }

    private void print2DUtil(Node root, int space) {
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value );
        print2DUtil(root.left, space);
        System.out.println();
        print2DUtil(root.right, space);

        // Print current node after space
        // count
//        for (int i = COUNT; i < space; i++)
//            System.out.print(" ");
//        for (int i = space; i > COUNT; i--)
//            System.out.print(" ");
//        System.out.print(root.value + "\n");

        // Process left child

    }
}
