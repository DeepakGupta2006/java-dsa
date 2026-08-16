package trees;

/**
 * Problem: Binary Search Tree - Insert & Inorder Traversal
 * Time Complexity: O(log n) avg for insert, O(n) for traversal
 * Space Complexity: O(n)
 */
public class BinarySearchTree {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    Node root;

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private Node insertRec(Node node, int val) {
        if (node == null) return new Node(val);
        if (val < node.val) node.left = insertRec(node.left, val);
        else if (val > node.val) node.right = insertRec(node.right, val);
        return node;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node == null) return;
        inorderRec(node.left);
        System.out.print(node.val + " ");
        inorderRec(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {5, 3, 8, 1, 4, 7, 9};
        for (int v : values) bst.insert(v);
        bst.inorder();
    }
}
