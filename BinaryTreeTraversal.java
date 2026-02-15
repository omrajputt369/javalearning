/**
 * A Java program to demonstrate Inorder, Preorder, and Postorder traversals of
 * a Binary Tree.
 */
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinaryTreeTraversal {
    Node root;

    public BinaryTreeTraversal() {
        root = null;
    }

    void printPostorder(Node node) {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal:");
        tree.printPreorder(tree.root);

        System.out.println("\nInorder traversal:");
        tree.printInorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.printPostorder(tree.root);
        System.out.println();
    }
}
